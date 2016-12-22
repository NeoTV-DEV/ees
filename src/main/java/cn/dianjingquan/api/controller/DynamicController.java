package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.DynamicList;
import cn.dianjingquan.api.dao.model.EventList;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.controller.DynamicController
 */
@RestController
@RequestMapping("/v1/match/dynamic")
@Api(value = "赛事动态 API", description = "赛事动态 API")
public class DynamicController {
    @ApiOperation(value = "获取赛事动态列表", notes = "", response = DynamicList.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "赛事id", paramType = "query", dataType = "long"),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "role", value = "用户身份", paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "round", value = "轮次", paramType = "query", dataType = "intger"),
            @ApiImplicitParam(name = "game", value = "游戏id", paramType = "query", dataType = "intger"),
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
    public DynamicList getList(@PathVariable long uid, @PathVariable String access_token, @PathVariable int page, @PathVariable int page_count){
        return new DynamicList();
    }
}
