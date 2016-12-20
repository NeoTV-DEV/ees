package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.MatchListView
 */
public class MatchListView {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("game_name")
    protected String gameName;

    @JsonProperty("game_id")
    protected long gameId;

    @JsonProperty("zone")
    protected String zone;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("total_reward")
    protected String friendlyTotalReward;

    @JsonProperty("icon_url")
    protected String iconUrl;

    @JsonProperty("is_team")
    protected boolean isTeam;

    @JsonProperty("address")
    protected String address;

    @JsonProperty("is_pass")
    protected boolean isPass;

    @JsonProperty("is_time_setting")
    protected boolean isTimeSetting;

    @JsonProperty("enroll_start_time")
    protected long enrollStartTime;

    @JsonProperty("enroll_end_time")
    protected long enrollEndTime;

    @JsonProperty("start_time")
    protected long startTime;

    @JsonProperty("end_time")
    protected long endTime;

    @JsonProperty("stages")
    protected int stages;

    @JsonProperty("friendly_stage_label")
    protected String friendlyStageLabel;

    @JsonProperty("enroll_count")
    protected int enrollCount;

    @JsonProperty("max_enroll_count")
    protected int maxEnrollCount;

    @JsonProperty("create_time")
    protected long createdTime;

    @JsonProperty("friendly_create_time")
    protected String friendlyCreatedTime;

    @JsonProperty("update_status_time")
    protected long updateStatusTime;

    @JsonProperty("friendly_update_status_time")
    protected String friendlyUpdateStatusTime;
}

