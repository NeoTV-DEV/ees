package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.entity.Enroll
 */
public class Enroll {
    @ApiModelProperty(name = "id",value = "报名id", required = true)
    @JsonProperty("id")
    protected long id;

    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty("match_id")
    protected long matchId;

    @ApiModelProperty(name = "game_id",value = "游戏id", required = true)
    @JsonProperty("game_id")
    protected long gameId;

    @ApiModelProperty(name = "uid",value = "用户id", required = true)
    @JsonProperty("uid")
    protected long uid;

    @JsonProperty("is_team")
    protected boolean isTeam;

    @JsonProperty("add_time")
    protected long addTime;

    @JsonProperty("full_name")
    protected String fullName;

    @JsonProperty("id_name")
    protected String idName;

    @JsonProperty("country_id")
    protected int countryId;

    @JsonProperty("seed_id")
    protected int seedId;

    @JsonProperty("status")
    protected int status;

    @JsonProperty("player1_id_name")
    protected String player1IdName;

    @JsonProperty("player2_id_name")
    protected String player2IdName;

    @JsonProperty("player3_id_name")
    protected String player3IdName;

    @JsonProperty("player4_id_name")
    protected String player4IdName;

    @JsonProperty("player5_id_name")
    protected String player5IdName;

    @JsonProperty("player1_country_id")
    protected int player1CountryId;

    @JsonProperty("player2_country_id")
    protected int player2CountryId;

    @JsonProperty("player3_country_id")
    protected int player3CountryId;

    @JsonProperty("player4_country_id")
    protected int player4CountryId;

    @JsonProperty("player5_country_id")
    protected int player5CountryId;

    @ApiModelProperty(name = "is_reg",value = "是否注册用户", required = true)
    @JsonProperty("is_reg")
    protected boolean isReg;

    @ApiModelProperty(name = "mobile",value = "联系方式", required = true)
    @JsonProperty("mobile")
    protected String mobile;
}
