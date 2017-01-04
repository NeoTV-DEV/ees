package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by tommy on 2017-1-4.
 * ees
 * cn.dianjingquan.api.dao.model.entity.SingleRule
 */
public class SingleRule implements Serializable {
    @ApiModelProperty(name = "stage",value = "第n阶段", required = true)
    @JsonProperty(value = "stage")
    protected int stage;

    @ApiModelProperty(name = "promotion",value = "晋级人数", required = true)
    @JsonProperty(value = "promotion")
    protected int promotion;

    @ApiModelProperty(name = "max_enroll_count",value = "最大报名人数", required = true)
    @JsonProperty(value = "max_enroll_count")
    protected int maxEnrollCount;

    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected long matchId;

    @ApiModelProperty(name = "name",value = "阶段名", required = true)
    @JsonProperty(value = "name")
    protected String name;

    @ApiModelProperty(name = "is_lpl",value = "是否存在季军赛", required = true)
    @JsonProperty(value = "is_lpl", defaultValue = "false")
    protected boolean isLpl;

    @ApiModelProperty(name = "rule_type",value = "规则类型", required = true)
    @JsonProperty(value = "rule_type")
    protected RuleType ruleType;
}
