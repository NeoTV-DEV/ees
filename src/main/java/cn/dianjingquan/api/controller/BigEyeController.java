package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.BigEye;
import cn.dianjingquan.api.dao.model.Game;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.controller.BigEyeController
 */
@RestController
@RequestMapping("/v1/match/bigeyes")
@Api(value = "大眼列表 API",description = "大眼列表 API")
public class BigEyeController {
    @ApiOperation(value = "获取大眼列表", notes = "", responseContainer = "List", response = BigEye.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "API key",defaultValue = "MWEyYzFhY2UtZDE3NS00ZDc4LT", paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功返回大眼列表"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/")
    public ArrayList<BigEye> getAll(@PathVariable String key){
        return new ArrayList<BigEye>();
    }
}
