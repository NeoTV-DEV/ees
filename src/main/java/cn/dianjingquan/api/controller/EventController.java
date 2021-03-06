package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.Error;
import cn.dianjingquan.api.dao.model.EventList;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.controller.EventController
 */
@RestController
@RequestMapping("/v1/match/event")
@Api(value = "事件 API", tags = "事件服务", description = "API")
public class EventController {
    @ApiOperation(value = "获取事件列表", notes = "", response = EventList.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户id", paramType = "query", dataType = "long"),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "page", value = "页码", paramType = "query", dataType = "intger"),
            @ApiImplicitParam(name = "page_count", value = "每页显示条数", paramType = "query", dataType = "intger")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = ""),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/")
    public EventList getList(@PathVariable long uid, @PathVariable String access_token, @PathVariable int page, @PathVariable int page_count){
        return new EventList();
    }

    @ApiOperation(value = "获取最新事件", notes = "", response = EventList.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户id", paramType = "query", dataType = "long"),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = ""),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/home")
    public EventList getAll(@PathVariable long uid, @PathVariable String access_token){
        return new EventList();
    }

    @ApiOperation(value = "标记已读消息", notes = "", response = Error.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户id", paramType = "query", dataType = "long"),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "key", value = "消息key", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public Error readEvent(@PathVariable long uid, @PathVariable String access_token, @PathVariable String key){
        return new Error();
    }

    @ApiOperation(value = "清空所有未读信息", notes = "", response = Error.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户id", paramType = "query", dataType = "long"),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/v1/match/event/readall")
    public Error readAllEvent(@PathVariable long uid, @PathVariable String access_token){
        return new Error();
    }
}
