package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.Game;
import cn.dianjingquan.api.dao.model.ImageUploadReturn;
import io.swagger.annotations.*;
import org.hibernate.annotations.GeneratorType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.controller.GameController
 */
@RestController
@RequestMapping("/v1/match/game")
@Api(value = "游戏列表 API ",description = "游戏列表 API")
public class GameController {
    @ApiOperation(value = "获取游戏列表", notes = "", responseContainer = "List", response = Game.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "API key" , defaultValue = "MWEyYzFhY2UtZDE3NS00ZDc4LT",paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功返回游戏列表"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/all")
    public ArrayList<Game> getAll(@PathVariable String key){
        return new ArrayList<Game>();
    }
}
