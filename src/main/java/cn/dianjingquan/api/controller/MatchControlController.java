package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.Error;
import cn.dianjingquan.api.dao.model.body.QRule;
import cn.dianjingquan.api.dao.model.body.QVerifyFail;
import cn.dianjingquan.api.dao.model.body.QVerifySuccess;
import cn.dianjingquan.api.dao.model.entity.MatchVerify;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.controller.MatchControlController
 */
@RestController
@Api(value = "赛事控制 API", tags = "赛事控制", description = "API")
public class MatchControlController {
    @ApiOperation(value = "报名开始", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "比赛id", paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/enroll_start", method = RequestMethod.PATCH)
    public Error enrollStart(@PathVariable long id, @PathVariable String access_token) {
        return new Error();
    }

    @ApiOperation(value = "报名结束", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "比赛id", paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v2/match/enroll_end", method = RequestMethod.PATCH)
    public Error enrollEnd(@PathVariable long id, @PathVariable String access_token) {
        return new Error();
    }

    @ApiOperation(value = "比赛开始", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "比赛id", paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/start", method = RequestMethod.PATCH)
    public Error start(@PathVariable long id, @PathVariable String access_token) {
        return new Error();
    }

    @ApiOperation(value = "比赛结束", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "比赛id", paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/end", method = RequestMethod.PATCH)
    public Error end(@PathVariable long id, @PathVariable String access_token) {
        return new Error();
    }

    @ApiOperation(value = "比赛关闭", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "比赛id", paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/close", method = RequestMethod.PATCH)
    public Error close(@PathVariable long id, @PathVariable String access_token) {
        return new Error();
    }

    @ApiOperation(value = "清空裁判名单", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "比赛id", paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/referee/all", method = RequestMethod.DELETE)
    public Error deleteReferee(@PathVariable long id, @PathVariable String access_token) {
        return new Error();
    }

    @ApiOperation(value = "获取审核原因", notes = "", response = MatchVerify.class, produces = "application/json", consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "审核原因id", paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "match_id", value = "比赛id", paramType = "query", dataType = "long", required = true),
            @ApiImplicitParam(name = "access_token", value = "token", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/verify_reason", method = RequestMethod.GET)
    public MatchVerify verifyReason(@PathVariable long id, @PathVariable String access_token) {
        return new MatchVerify();
    }

    @ApiOperation(value = "发送比赛审核通过消息", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/verify_notify/success", method = RequestMethod.POST)
    public Error notifyVerifySuccess(@RequestBody QVerifySuccess json) {
        return new Error();
    }

    @ApiOperation(value = "发送比赛审核失败消息", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/verify_notify/fail", method = RequestMethod.POST)
    public Error notifyVerifyFail(@RequestBody QVerifyFail json) {
        return new Error();
    }
}
