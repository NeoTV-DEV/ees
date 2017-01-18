package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.Game;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.controller.GameController
 */
@RestController
@Api(value = "游戏列表 API ",tags = "游戏列表", description = "API")
public class GameController {
    @ApiOperation(value = "获取游戏列表V1.0", notes = "", responseContainer = "List", response = Game.class, consumes = "application/json", produces = "application/json")
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功返回游戏列表"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/v1/match/game/all")
    public ArrayList<Game> getAll(@PathVariable String key){
        return new ArrayList<Game>();
    }

    @ApiOperation(value = "获取游戏列表V1.5", notes = "", responseContainer = "List", response = cn.dianjingquan.api.dao.model.entity.Game.class, consumes = "application/json", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "API key" , defaultValue = "MWEyYzFhY2UtZDE3NS00ZDc4LT",paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功返回游戏列表"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/v2/match/game/all")
    public ArrayList<cn.dianjingquan.api.dao.model.entity.Game> getAllV2(@PathVariable String key){
        return new ArrayList<cn.dianjingquan.api.dao.model.entity.Game>();
    }
}
