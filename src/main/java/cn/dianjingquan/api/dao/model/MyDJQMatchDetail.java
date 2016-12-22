package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.dao.model.MyDJQMatchDetail
 */
public class MyDJQMatchDetail extends MatchDetail {

    @JsonProperty("user_role")
    protected String[] role;

    @JsonProperty("enroll_status")
    protected boolean enrollStatus;

    @JsonProperty("player_status")
    protected String playerStatus;
}
