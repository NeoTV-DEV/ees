package cn.dianjingquan.user.controller;

import cn.dianjingquan.utils.CheckInputHelper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonObject;
import io.swagger.annotations.*;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import java.util.Date;
import cn.dianjingquan.*;

/**
 * Created by tommy on 2016-10-19.
 * usercenter
 * cn.dianjingquan.user.controller.
 */
@RestController
@RequestMapping("/v1/uc/code")
@Api(value = "验证码 API ",description = "<=请点击----验证码接口详情")
public class CodeController {
    @ApiOperation(value = "注册用户获取验证码", notes = "根据手机号获取验证码,返回一个4位验证码")
    @RequestMapping(value = "/{mobile}",method = RequestMethod.POST)
    public ResponseEntity<?> getCode(@PathVariable String mobile, HttpServletRequest req){
        String d = req.getRemoteAddr();
        Date reqTime = new Date();
        ObjectMapper json = new ObjectMapper();
        try {
            if(mobile == null || !CheckInputHelper.isCheckMobile(mobile)){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(json.writeValueAsString("输入的手机号不正确"));
            }
            return ResponseEntity.ok(null);
        }catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @ApiOperation(value = "用户忘记密码获取验证码", notes = "")
    @RequestMapping(value = "/{mobile}",method = RequestMethod.PATCH)
    public String getCodeByUpdate(@PathVariable String mobile){
        return "12345";
    }

    @ApiOperation(value = "用户请求验证验证码", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mobile", value = "手机号",paramType = "json",dataType = "String", required = true),
            @ApiImplicitParam(name = "code", value = "验证码" , dataType = "String", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "成功"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端错误"),
    })
    @RequestMapping(value = "/validCode",method = RequestMethod.POST)
    public @ResponseBody String validCode(@ApiIgnore @RequestBody JsonNode json){
        logger.info(json.toString());
        return "ok";
    }

    private static Logger logger = LoggerFactory.getLogger(CodeController.class);
}
