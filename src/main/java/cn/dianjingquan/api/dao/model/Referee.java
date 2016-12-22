package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.dao.model.Referee
 */
public class Referee {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("uid")
    protected String uid;

    @JsonProperty("match_id")
    protected long matchId;

    @JsonProperty("mobile")
    protected String mobile;

    @JsonProperty("add_time")
    protected String addTime;

    @JsonProperty("nick_name")
    protected String nickName;

    @JsonProperty("country")
    protected int country;
}
