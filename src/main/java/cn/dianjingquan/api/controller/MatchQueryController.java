package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.*;
import cn.dianjingquan.api.dao.model.Error;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.controller.MatchQueryController
 */
@RestController
@RequestMapping("/v3/match")
@Api(value = "赛事列表 API",tags = "赛事列表", description = "API")
public class MatchQueryController {
    @ApiOperation(value = "获取赛事列表", notes = "", response = MatchList.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "game_id", value = "游戏id" , defaultValue = "1",paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "status", value = "筛选状态" , defaultValue = "all",paramType = "query", dataType = "string", allowMultiple = true, allowableValues = "all,enroll,start", required = true),
            @ApiImplicitParam(name = "key", value = "关键字" , defaultValue = "",paramType = "query", dataType = "string", required = true),
            @ApiImplicitParam(name = "page", value = "页码" , defaultValue = "1",paramType = "query", dataType = "intger", required = true),
            @ApiImplicitParam(name = "page_count", value = "每页显示数" , defaultValue = "40",paramType = "query", dataType = "intger", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功返回赛事列表"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/query")
        public MatchList getAll(@PathVariable long game_id, @PathVariable String status, @PathVariable String key, @PathVariable int page, @PathVariable int page_count){
        return new MatchList();
    }

    @ApiOperation(value = "获取我的电竞圈赛事列表", notes = "",responseContainer = "List", response = MyDJQMatchView.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "game_id", value = "游戏id" , defaultValue = "0",paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "status", value = "筛选状态" , defaultValue = "all",paramType = "query", dataType = "string", allowMultiple = true, allowableValues = "all,edit,enroll_start,enroll_end,start,end", required = true),
            @ApiImplicitParam(name = "key", value = "关键字",paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "uid", value = "用户 id",paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "page", value = "页码" , defaultValue = "1",paramType = "query", dataType = "intger", required = true),
            @ApiImplicitParam(name = "page_count", value = "每页显示数" , defaultValue = "40",paramType = "query", dataType = "intger", required = true),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功返回赛事列表"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/mydjq")
    public ArrayList<MyDJQMatchView> getMyDJQ(@PathVariable long game_id, @PathVariable String status, @PathVariable String key, @PathVariable long uid, @PathVariable int page, @PathVariable int page_count, @PathVariable String access_token){
        return new ArrayList<MyDJQMatchView>();
    }

    @ApiOperation(value = "获取我的电竞圈赛事状态列表", notes = "", response = MyDJQMatchStatus.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "json", dataType = "string", required = true),
            @ApiImplicitParam(name = "list", value = "比赛id列表Object[match_id,uid]" , paramType = "json", dataType = "array",allowMultiple = true, required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = ""),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @RequestMapping(value = "/mydjqstatus",method = RequestMethod.POST)
    public ArrayList<MyDJQMatchStatus> getMyDJQStatus(){
        return new ArrayList<>();
    }
}
