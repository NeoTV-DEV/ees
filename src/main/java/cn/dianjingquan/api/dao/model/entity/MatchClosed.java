package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017/1/18.
 * ees
 * cn.dianjingquan.api.dao.model.entity.MatchClosed
 */
public class MatchClosed {
    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty("match_id")
    protected long id;

    @ApiModelProperty(name = "is_close",value = "是否已关闭", required = true)
    @JsonProperty("is_close")
    protected boolean isClose = false;
}
