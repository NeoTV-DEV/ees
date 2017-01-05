package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.entity.VSEnroll
 */
public class VSEnroll {
    @ApiModelProperty(name = "enroll_id",value = "选手报名id", required = true)
    @JsonProperty(value = "enroll_id")
    protected long enrollId;

    @ApiModelProperty(name = "uid",value = "选手用户id", required = true)
    @JsonProperty(value = "uid")
    protected long uid;

    @ApiModelProperty(name = "vs_id",value = "vs_id", required = true)
    @JsonProperty(value = "vs_id")
    protected String vsId;

    @ApiModelProperty(name = "enroll_status",value = "该选手在本场对阵的对阵结果状态", required = true, allowableValues = "WINNER,LOSER,DRAW,QUIT")
    @JsonProperty(value = "enroll_status")
    protected String enrollStatus;

    @ApiModelProperty(name = "player_status",value = "该选手在本场对阵的当前状态", required = true)
    @JsonProperty(value = "player_status")
    protected VSPlayerStatus playerStatus;

    @ApiModelProperty(name = "vs_status",value = "本场对阵的状态", required = true)
    @JsonProperty(value = "vs_status")
    protected VSStatusType vsStatus;

    @ApiModelProperty(name = "id_name",value = "选手游戏ID名", required = true)
    @JsonProperty(value = "id_name")
    protected String idName;

    @ApiModelProperty(name = "full_name",value = "选手报名昵称", required = true)
    @JsonProperty(value = "full_name")
    protected String fullName;

    @ApiModelProperty(name = "enroll_uid_a",value = "A选手用户id", required = true)
    @JsonProperty(value = "enroll_uid_a")
    protected long enrollUidA;

    @ApiModelProperty(name = "enroll_uid_b",value = "B选手用户id", required = true)
    @JsonProperty(value = "enroll_uid_b")
    protected long enrollUidB;

    @ApiModelProperty(name = "enroll_id_a",value = "A选手报名id", required = true)
    @JsonProperty(value = "enroll_id_a")
    protected long enrollIdA;

    @ApiModelProperty(name = "enroll_id_b",value = "B选手报名id", required = true)
    @JsonProperty(value = "enroll_id_b")
    protected long enrollIdB;

    @ApiModelProperty(name = "a_score",value = "A选手比分", required = true)
    @JsonProperty(value = "a_score")
    protected int aScore;

    @ApiModelProperty(name = "b_score",value = "B选手比分", required = true)
    @JsonProperty(value = "b_score")
    protected int bScore;

    @ApiModelProperty(name = "winner",value = "本vs获胜者报名id", required = true)
    @JsonProperty(value = "winner")
    protected long winner;

    @ApiModelProperty(name = "referee_id",value = "裁判id", required = true)
    @JsonProperty(value = "referee_id")
    protected long refereeId;
}
