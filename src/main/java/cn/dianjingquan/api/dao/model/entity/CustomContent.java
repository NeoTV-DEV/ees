package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017-1-4.
 * ees
 * cn.dianjingquan.api.dao.model.entity.CustomContent
 */
public class CustomContent {
    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected long matchId;

    @ApiModelProperty(name = "title",value = "标题", required = true)
    @JsonProperty(value = "title")
    protected String title;

    @ApiModelProperty(name = "content",value = "内容", required = true)
    @JsonProperty(value = "content")
    protected String content;
}
