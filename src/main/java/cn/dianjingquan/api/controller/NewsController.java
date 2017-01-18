package cn.dianjingquan.api.controller;

import cn.dianjingquan.api.dao.model.Game;
import cn.dianjingquan.api.dao.model.News;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.controller.NewsController
 */
@RestController
@RequestMapping("/v1/match/news")
@Api(value = "新闻列表 API",tags = "新闻列表", description = "API")
public class NewsController {
    @ApiOperation(value = "获取新闻列表", notes = "", responseContainer = "List", response = News.class, consumes = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "API key" , defaultValue = "MWEyYzFhY2UtZDE3NS00ZDc4LT",paramType = "query", dataType = "string")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功返回新闻列表"),
            @ApiResponse(code = 400,message = "客户端请求错误"),
            @ApiResponse(code = 404,message = ""),
            @ApiResponse(code = 409,message = ""),
            @ApiResponse(code = 500,message = "服务端内部错误"),
    })
    @GetMapping("/")
    public ArrayList<News> getAll(@PathVariable String key){
        return new ArrayList<News>();
    }
}
