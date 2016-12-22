package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-21.
 * ees
 * cn.dianjingquan.api.dao.model.Enroll
 */
public class Enroll {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("match_id")
    protected long matchId;

    @JsonProperty("game_id")
    protected long gameId;

    @JsonProperty("uid")
    protected long uid;

    @JsonProperty("is_team")
    protected boolean isTeam;

    @JsonProperty("add_time")
    protected String addTime;

    @JsonProperty("full_name")
    protected String fullName;

    @JsonProperty("id_name")
    protected String idName;

    @JsonProperty("country_id")
    protected int countryId;

    @JsonProperty("seed_id")
    protected int seedId;

    @JsonProperty("status")
    protected String status;

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

    @JsonProperty("is_reg")
    protected int isReg;

    @JsonProperty("mobile")
    protected String mobile;
}
