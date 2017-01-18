package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.Error;
import cn.dianjingquan.api.dao.model.Referee;
import cn.dianjingquan.api.dao.model.body.QContent;
import cn.dianjingquan.api.dao.model.body.QRule;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.controller.MatchBuildController
 */
@RestController
@RequestMapping("/v3/match/builder")
@Api(value = "构建赛事 API",tags = "构建赛事", description = "API")
public class MatchBuildController {
    @ApiOperation(value = "创建赛事第一步", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200,message = ""),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @RequestMapping(value = "/rule",method = RequestMethod.POST)
    public Error rule(@RequestBody QRule json){
        return new Error();
    }

    @ApiOperation(value = "创建赛事第二步", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200,message = "")
    })
    @RequestMapping(value = "/content",method = RequestMethod.POST)
    public Error content(@RequestBody QContent json){
        return new Error();
    }
}
