package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.MyDJQMatchStatus
 */
public class MyDJQMatchStatus {
    @JsonProperty("match_id")
    protected long matchId;

    @JsonProperty("uid")
    protected long uid;

    @JsonProperty("role")
    protected String[] role;

    @JsonProperty("is_referee_msg")
    protected boolean isRefereeMsg;

    @JsonProperty("actual_enroll_count")
    protected int actualEnrollCount;

    @JsonProperty("current_countdown")
    protected String currentCountDown;
}
