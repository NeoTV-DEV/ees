package cn.dianjingquan.api.dao.model.body;

import cn.dianjingquan.api.dao.model.entity.RuleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.body.
 */
public class QConfirmVS {
    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected long matchId;

    @ApiModelProperty(name = "uid",value = "确认人用户id", required = true)
    @JsonProperty(value = "uid")
    protected long uid;

    @ApiModelProperty(name = "vs_id",value = "对阵id", required = true)
    @JsonProperty(value = "vs_id")
    protected String vsId;

    @ApiModelProperty(name = "access_token",value = "token", required = true)
    @JsonProperty(value = "access_token")
    protected String token;

    @ApiModelProperty(name = "u_role",value = "提交人角色", required = true, allowableValues = "Organizer,Player,Referee")
    @JsonProperty(value = "u_role")
    protected String role;
}
