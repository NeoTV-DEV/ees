package cn.dianjingquan.api.dao.model.body;

import cn.dianjingquan.api.dao.model.entity.RuleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.body.QApplyRefereeVS
 */
public class QApplyRefereeVS {
    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected long matchId;

    @ApiModelProperty(name = "uid",value = "提交人用户id", required = true)
    @JsonProperty(value = "uid")
    protected long uid;

    @ApiModelProperty(name = "vs_id",value = "对阵id", required = true)
    @JsonProperty(value = "vs_id")
    protected String vsId;

    @ApiModelProperty(name = "access_token",value = "token", required = true)
    @JsonProperty(value = "access_token")
    protected String token;

    @ApiModelProperty(name = "a_score",value = "A选手比分", required = true)
    @JsonProperty(value = "a_score")
    protected int aScore;

    @ApiModelProperty(name = "b_score",value = "B选手比分", required = true)
    @JsonProperty(value = "b_score")
    protected int bScore;

    @ApiModelProperty(name = "rule",value = "当前阶段赛制")
    @JsonProperty(value = "rule")
    protected RuleType rule;

    @ApiModelProperty(name = "enroll_id",value = "选手报名id,[可选参数，当选手身份提交时]")
    @JsonProperty(value = "enroll_id")
    protected long enrollId;
}
