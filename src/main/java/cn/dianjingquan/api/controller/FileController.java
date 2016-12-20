package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.ImageUploadReturn;
import cn.dianjingquan.api.dao.model.UserSession;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tommy on 2016-12-19.
 * ees
 * cn.dianjingquan.api.controller.FileController
 */
@RestController
@RequestMapping("/v1/file")
@Api(value = "文件服务 API", description = "文件服务 API")
public class FileController {
    @ApiOperation(value = "文件上传", notes = "", response = ImageUploadReturn.class, consumes = "multipart/form-data")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_token", value = "token" , paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public ImageUploadReturn uploadFile(){
        return new ImageUploadReturn();
    }
}
