package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by tommy on 2017-1-4.
 * ees
 * cn.dianjingquan.api.dao.model.entity.GroupRule
 */
public class GroupRule implements Serializable {
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
    @JsonProperty(value = "rule_type", defaultValue = "GROUP")
    protected RuleType ruleType;

    @ApiModelProperty(name = "loop",value = "循环次数", required = true)
    @JsonProperty(value = "loop", defaultValue = "1")
    protected int loop;

    @ApiModelProperty(name = "max_count",value = "每组最大人数", required = true)
    @JsonProperty(value = "max_count", defaultValue = "4")
    protected int maxCount;

    @ApiModelProperty(name = "ranking_mode",value = "排序方式", required = true)
    @JsonProperty(value = "ranking_mode", defaultValue = "Point")
    protected RankingType rankingType;

    @ApiModelProperty(name = "game_win",value = "大场获胜积分", required = true)
    @JsonProperty(value = "game_win", defaultValue = "0")
    protected int gameWin;

    @ApiModelProperty(name = "game_fail",value = "大场失败积分", required = true)
    @JsonProperty(value = "game_fail", defaultValue = "0")
    protected int gameFail;

    @ApiModelProperty(name = "game_draw",value = "大场平局积分", required = true)
    @JsonProperty(value = "game_draw", defaultValue = "0")
    protected int gameDraw;

    @ApiModelProperty(name = "score_win",value = "小场获胜积分", required = true)
    @JsonProperty(value = "score_win", defaultValue = "0")
    protected int scoreWin;

    @ApiModelProperty(name = "score_fail",value = "小场失败积分", required = true)
    @JsonProperty(value = "score_fail", defaultValue = "0")
    protected int scoreFail;
}
