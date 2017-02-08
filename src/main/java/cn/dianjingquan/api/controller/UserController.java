package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.Error;
import cn.dianjingquan.api.dao.model.User;
import cn.dianjingquan.api.dao.model.UserLoginReturn;
import cn.dianjingquan.api.dao.model.UserSession;
import cn.dianjingquan.api.dao.model.body.QUserGame;
import cn.dianjingquan.api.dao.model.entity.UserGame;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by tommy on 2016-10-19.
 * user center service
 * cn.dianjingquan.api.controller.UserController
 */
@RestController
@Api(value = "用户操作 API", tags = "用户", description = "API")
public class UserController {
    @ApiOperation(value = "用户注册", notes = "", response = UserSession.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mobile", value = "手机号", paramType = "json", dataType = "string", required = true),
            @ApiImplicitParam(name = "code", value = "验证码" , paramType = "json", dataType = "string", required = true),
            @ApiImplicitParam(name = "pwd", value = "密码" , paramType = "json", dataType = "string", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/user/register/one",method = RequestMethod.POST)
    public UserSession regByStepOne(){
        return new UserSession();
    }

    @ApiOperation(value = "用户设置多种属性（用户注册第二步）", notes = "", response = Error.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_token", value = "手机号", paramType = "json", dataType = "string", required = true),
            @ApiImplicitParam(name = "uid", value = "验证码" , paramType = "json", dataType = "long", required = true),
            @ApiImplicitParam(name = "avatar", value = "头像id" , paramType = "json", dataType = "intger", required = true),
            @ApiImplicitParam(name = "country", value = "国籍（地区）", paramType = "json", dataType = "string", required = true),
            @ApiImplicitParam(name = "nick_name", value = "昵称" , paramType = "json", dataType = "string", required = true),
            @ApiImplicitParam(name = "gender", value = "性别" , paramType = "json", dataType = "string", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/user/attribute",method = RequestMethod.POST)
    public Error setAttribute(){
        return new Error();
    }

    @ApiOperation(value = "登录", notes = "", response = UserLoginReturn.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user_name", value = "手机号", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "pwd", value = "密码" , paramType = "query", dataType = "String", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/user/login",method = RequestMethod.POST)
    public UserLoginReturn login(){
        return new UserLoginReturn();
    }

    @ApiOperation(value = "推送消息设置", notes = "", response = Error.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "json", dataType = "string", required = true),
            @ApiImplicitParam(name = "uid", value = "用户id" , paramType = "json", dataType = "long", required = true),
            @ApiImplicitParam(name = "mode", value = "设置Map<Intger,Boolean>" , paramType = "json", dataType = "array",allowMultiple = true, required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "mode为Map[Intger,Boolean] \n key 1:[主办方身份]审核出结果时提醒 \n key 2:[主办方身份]报名人数到达上限时提醒 \n key 3:[选手身份]系统接受您的报名时提醒 \n key 4:[选手身份]比赛正式开始时提醒"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/user/isreceivemsg",method = RequestMethod.POST)
    public Error isReceiveMSG(){
        return new Error();
    }

    @ApiOperation(value = "获取用户信息", notes = "", response = User.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户id", paramType = "query", dataType = "string", required = true),
            @ApiImplicitParam(name = "access_token", value = "token" , paramType = "query", dataType = "string", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/v1/match/user/show")
    public User getShow(@PathVariable String uid, @PathVariable String access_token){
        return new User();
    }

    @ApiOperation(value = "用户注销", notes = "", response = Error.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_token", value = "token" , paramType = "query", dataType = "string", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/user/logout",method = RequestMethod.POST)
    public Error logout(@PathVariable String access_token){
        return new Error();
    }

    @RequestMapping(value = "/v1/match/user/nickname",method = RequestMethod.POST)
    public String setNickName(){
        return "ok";
    }

    @RequestMapping(value = "/v1/match/user/avatar",method = RequestMethod.POST)
    public String setAvatar(){
        return "ok";
    }

    @RequestMapping(value = "/v1/match/user/gender",method = RequestMethod.POST)
    public String setGender(){
        return "ok";
    }

    @RequestMapping(value = "/v1/match/user/bgimg",method = RequestMethod.POST)
    public String setBgImg(){
        return "ok";
    }

    @RequestMapping(value = "/v1/match/user/game",method = RequestMethod.POST)
    public String setGame(){
        return "ok";
    }

    @RequestMapping(value = "/v1/match/user/pwd",method = RequestMethod.POST)
    public String updatePWD(){
        return "ok";
    }

    @GetMapping("/v1/match/user/nickname")
    public String getNickName(){
        return "ok";
    }

    @GetMapping("/v1/match/user/mobile/{mobile}")
    public String getUserByMobile(@PathVariable String mobile){
        return "ok";
    }

    @GetMapping("/v1/match/user/id/{id}")
    public String getUser(@PathVariable String id){
        return "ok";
    }

    @ApiOperation(value = "设置用户游戏列表", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v3/match/usergame",method = RequestMethod.POST)
    public Error createV3(@RequestBody QUserGame json){
        return new Error();
    }

    @ApiOperation(value = "获取用户游戏列表", notes = "", response = UserGame.class, produces = "application/json", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户id", paramType = "query", dataType = "long"),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @GetMapping("/v3/match/usergame/findbyuid")
    public ArrayList<UserGame> finderByUIDV3(@PathVariable long id, @PathVariable String accessToken){
        return new ArrayList<UserGame>();
    }
}
