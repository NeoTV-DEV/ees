package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.dao.model.Rank
 */
public class Rank {
    @JsonProperty("rank")
    protected int rank;

    @JsonProperty("uid")
    protected String uid;

    @JsonProperty("enroll_id")
    protected String enrollId;

    @JsonProperty("match_id")
    protected String matchId;

    @JsonProperty("id_name")
    protected String idName;

    @JsonProperty("full_name")
    protected String fullName;

    @JsonProperty("reward")
    protected String reward;

    @JsonProperty("friendly_reward")
    protected String friendlyReward;

    @JsonProperty("country_id")
    protected int countryId;
}
