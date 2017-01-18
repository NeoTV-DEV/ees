package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.entity.Image;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tommy on 2017/1/18.
 * ees
 * cn.dianjingquan.api.controller.ImgController
 */
@RestController
@Api(value = "图片服务 API", tags = "图片服务", description = "API")
public class ImgController {
    @ApiOperation(value = "获取随机封面图",notes = "根据索引位返回封面图", response = Image.class, consumes = "application/json", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_token", value = "token" , paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "index", value = "索引位" , paramType = "query", dataType = "integer")
    })
    @ApiResponses({
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping(value = "/v2/cover/random")
    public Image getCoverV2(@PathVariable String token, @PathVariable int index){
        return new Image();
    }

    @ApiOperation(value = "获取随机头像",notes = "根据索引位返回头像", response = Image.class, consumes = "application/json", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_token", value = "token" , paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "index", value = "索引位" , paramType = "query", dataType = "integer")
    })
    @ApiResponses({
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping(value = "/v2/icon/random")
    public Image getIconV2(@PathVariable String token, @PathVariable int index){
        return new Image();
    }
}
