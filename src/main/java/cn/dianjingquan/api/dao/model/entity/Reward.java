package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017-1-4.
 * ees
 * cn.dianjingquan.api.dao.model.entity.Reward
 */
public class Reward {
    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected long matchId;

    @ApiModelProperty(name = "reward",value = "奖励内容", required = true)
    @JsonProperty(value = "reward")
    protected String reward;

    @ApiModelProperty(name = "name",value = "显示标题", required = true)
    @JsonProperty(value = "name")
    protected String name;

    @ApiModelProperty(name = "unit",value = "名次", required = true, allowableValues = "0,1,2,3")
    @JsonProperty(value = "unit")
    protected int unit;
}
