package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.Error;
import cn.dianjingquan.api.dao.model.body.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.controller.VSController
 */
@RestController
@Api(value = "对阵控制 API", description = "对阵控制 API")
public class VSController {
    @ApiOperation(value = "提交比分", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v2/match/vs/result", method = RequestMethod.POST)
    public Error submitResult(@RequestBody QSubmitVS json) {
        return new Error();
    }

    @ApiOperation(value = "对位选手确认比分", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v2/match/vs/confirm_result", method = RequestMethod.POST)
    public Error confirmResult(@RequestBody QConfirmVS json) {
        return new Error();
    }

    @ApiOperation(value = "选手申请仲裁", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v2/match/vs/apply_referee", method = RequestMethod.POST)
    public Error applyReferee(@RequestBody QApplyRefereeVS json) {
        return new Error();
    }

    @ApiOperation(value = "[V1]弃权VS", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/vs/invalidvs", method = RequestMethod.POST)
    public Error invalidVS(@RequestBody QInvalidVS json) {
        return new Error();
    }

    @ApiOperation(value = "[V1.5]弃权VS", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v2/match/vs/invalid", method = RequestMethod.POST)
    public Error invalid(@RequestBody QInvalidVS json) {
        return new Error();
    }

    @ApiOperation(value = "单边弃权", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/vs/invalidsingle", method = RequestMethod.POST)
    public Error invalidSingle(@RequestBody QInvalidVS json) {
        return new Error();
    }

    @ApiOperation(value = "比分重置", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v2/match/vs/reset", method = RequestMethod.POST)
    public Error reset(@RequestBody QInvalidVS json) {
        return new Error();
    }

    @ApiOperation(value = "提交VS截图", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v2/match/vs/result/img", method = RequestMethod.POST)
    public Error submitResultImg(@RequestBody QSubmitVSImg json) {
        return new Error();
    }

    @ApiOperation(value = "删除提交的VS截图", notes = "", response = Error.class, produces = "application/json", consumes = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200, message = ""),
            @ApiResponse(code = 400, message = "客户端请求错误"),
            @ApiResponse(code = 500, message = "服务端内部错误"),
    })
    @RequestMapping(value = "/v1/match/vs/result/img", method = RequestMethod.DELETE)
    public Error deleteResultImg(@PathVariable long id,@PathVariable String access_token) {
        return new Error();
    }
}
