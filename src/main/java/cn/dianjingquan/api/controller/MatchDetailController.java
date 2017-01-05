package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.MyDJQMatchDetail;
import cn.dianjingquan.api.dao.model.entity.MatchDetail;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tommy on 2017-1-4.
 * ees
 * cn.dianjingquan.api.controller.MatchDetailController
 */
@RestController
@RequestMapping("/v3/match")
@Api(value = "v1.5 赛事详情 API",description = "v1.5 赛事详情 API")
public class MatchDetailController {
    @ApiOperation(value = "赛事详情页", notes = "note: 未登录状态不需要带access_token", response = MatchDetail.class, consumes = "application/json", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "比赛id", paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功返回赛事列表"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/detail")
    public MatchDetail getDetail(@PathVariable long id, @PathVariable String access_token){
        return new MatchDetail();
    }
}
