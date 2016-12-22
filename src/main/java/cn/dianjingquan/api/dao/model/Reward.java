package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.dao.model.Reward
 */
public class Reward {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("match_id")
    protected long matchId;

    @JsonProperty("reward")
    protected String reward;

    @JsonProperty("rank")
    protected int rank;

    @JsonProperty("unit")
    protected int unit;

    @JsonProperty("add_time")
    protected String createdTime;

    @JsonProperty("friendly_reward")
    protected String friendlyReward;
}
