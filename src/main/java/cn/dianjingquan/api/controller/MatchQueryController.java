package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.MatchList;
import cn.dianjingquan.api.dao.model.News;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.controller.MatchQueryController
 */
@RestController
@RequestMapping("/v3/match")
@Api(value = "赛事列表 API",description = "赛事列表 API")
public class MatchQueryController {
    @ApiOperation(value = "获取赛事列表", notes = "", response = MatchList.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "game_id", value = "游戏id" , defaultValue = "1",paramType = "query", dataType = "long"),
            @ApiImplicitParam(name = "status", value = "筛选状态" , defaultValue = "all",paramType = "query", dataType = "string", allowMultiple = true, allowableValues = "all,enroll,start"),
            @ApiImplicitParam(name = "key", value = "关键字" , defaultValue = "",paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "page", value = "页码" , defaultValue = "1",paramType = "query", dataType = "intger"),
            @ApiImplicitParam(name = "page_count", value = "每页显示数" , defaultValue = "40",paramType = "query", dataType = "intger")
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
}
