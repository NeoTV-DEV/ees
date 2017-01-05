package cn.dianjingquan.api.dao.model.entity;

import cn.dianjingquan.api.dao.model.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by tommy on 2017-1-4.
 * ees
 * cn.dianjingquan.api.dao.model.entity.MatchDetail
 */
public class MatchDetail {
    @JsonProperty("id")
    protected long id;

    @ApiModelProperty(name = "name",value = "比赛名称", required = true)
    @JsonProperty(value = "name")
    protected String name;

    @ApiModelProperty(name = "is_team",value = "个人赛或战队赛", required = true)
    @JsonProperty(value = "is_team", defaultValue = "false")
    protected boolean isTeam;

    @ApiModelProperty(name = "version",value = "游戏版本", required = true)
    @JsonProperty(value = "version")
    protected String version;

    @ApiModelProperty(name = "is_player_referee",value = "是否选手自判", required = true)
    @JsonProperty(value = "is_player_referee", defaultValue = "false")
    protected boolean isPlayerReferee;

    @ApiModelProperty(name = "appoint_referee",value = "是否应用裁判", required = true)
    @JsonProperty(value = "appoint_referee", defaultValue = "false")
    protected boolean appointReferee;

    @ApiModelProperty(name = "is_open_enroll_list",value = "是否公开报名", required = true)
    @JsonProperty(value = "is_open_enroll_list", defaultValue = "false")
    protected boolean isOpenEnrollList;

    @ApiModelProperty(name = "bg_id",value = "赛事背景图id", required = true)
    @JsonProperty(value = "bg_id")
    protected int bgId;

    @ApiModelProperty(name = "bg_url",value = "赛事背景图url", required = true)
    @JsonProperty(value = "bg_url")
    protected String bgUrl;

    @ApiModelProperty(name = "game_name",value = "游戏名称", required = true)
    @JsonProperty("game_name")
    protected String gameName;

    @ApiModelProperty(name = "game_id",value = "游戏ID", required = true)
    @JsonProperty("game_id")
    protected long gameId;

    @ApiModelProperty(name = "thumbnail_id",value = "缩略图ID", required = true)
    @JsonProperty("thumbnail_id")
    protected long thumbnailId;

    @ApiModelProperty(name = "thumbnail_url",value = "缩略图url", required = true)
    @JsonProperty("thumbnail_url")
    protected String thumbnailUrl;

    @ApiModelProperty(name = "total_reward",value = "总奖金", required = true)
    @JsonProperty("total_reward")
    protected String totalReward;

    @ApiModelProperty(name = "enroll_count",value = "当前报名人数", required = true)
    @JsonProperty("enroll_count")
    protected int enrollCount;

    @ApiModelProperty(name = "max_enroll_count",value = "最大报名人数", required = true)
    @JsonProperty("max_enroll_count")
    protected int maxEnrollCount;

    @ApiModelProperty(name = "enroll_start_time",value = "报名开始时间", required = true)
    @JsonProperty(value = "enroll_start_time")
    protected long enrollStartTime;

    @ApiModelProperty(name = "enroll_end_time",value = "报名结束时间", required = true)
    @JsonProperty(value = "enroll_end_time")
    protected long enrollEndTime;

    @ApiModelProperty(name = "start_time",value = "比赛开始时间", required = true)
    @JsonProperty(value = "start_time")
    protected long startTime;

    @ApiModelProperty(name = "end_time",value = "比赛结束时间", required = true)
    @JsonProperty(value = "end_time")
    protected long endTime;

    @ApiModelProperty(name = "status",value = "赛事状态", required = true)
    @JsonProperty("status")
    protected MatchStatusType status;

    @ApiModelProperty(name = "friendly_update_time",value = "更新时间显示", readOnly = true)
    @JsonProperty("friendly_update_time")
    protected String friendlyUpdateTime;

    @ApiModelProperty(name = "friendly_created_time",value = "创建时间显示", readOnly = true)
    @JsonProperty("friendly_created_time")
    protected String friendlyCreatedTime;

    @ApiModelProperty(name = "create_time",value = "创建时间", readOnly = true)
    @JsonProperty("create_time")
    protected long createTime;

    @ApiModelProperty(name = "summary",value = "赛事简介", readOnly = true)
    @JsonProperty("summary")
    protected String summary;

    @ApiModelProperty(name = "enabled",value = "赛事可用状态", required = true)
    @JsonProperty("enabled")
    protected boolean enabled;

    @ApiModelProperty(name = "zone",value = "赛区", required = true)
    @JsonProperty("zone")
    protected String zone;

    @ApiModelProperty(name = "type",value = "赛事类型", required = true)
    @JsonProperty("type")
    protected String type;

    @ApiModelProperty(name = "is_pass",value = "审核状态", required = true)
    @JsonProperty("is_pass")
    protected boolean isPass;

    @ApiModelProperty(name = "vs_life_cycle",value = "vs生命周期", allowableValues = "1,2,3", required = true)
    @JsonProperty(value = "vs_life_cycle", defaultValue = "1")
    protected int vsLifeCycle;

    @ApiModelProperty(name = "vs_url",value = "对阵图URL", required = true)
    @JsonProperty("vs_url")
    protected String vsUrl;

    @ApiModelProperty(name = "address",value = "比赛地址", required = true)
    @JsonProperty(value = "address")
    protected String address;

    @ApiModelProperty(name = "is_time_setting",value = "倒计时开关", required = true)
    @JsonProperty(value = "is_time_setting", defaultValue = "false")
    protected boolean isTimeSetting;

    @ApiModelProperty(name = "stages",value = "赛事阶段数", required = true)
    @JsonProperty("stages")
    protected int stages;

    @ApiModelProperty(name = "rule",value = "当前阶段赛制", required = true)
    @JsonProperty("rule")
    protected RuleType rule;

    @ApiModelProperty(name = "is_lpl",value = "是否存在季军赛，如当前阶段赛制是单淘时存在")
    @JsonProperty("is_lpl")
    protected boolean isLpl;

    @ApiModelProperty(name = "current_count_down",value = "当前倒计时", required = true, allowableValues = "NONE,ENROLLSTART,ENROLLSTOP,START,END")
    @JsonProperty("current_count_down")
    protected String currentCountDown;

    @ApiModelProperty(name = "format",value = "自定义显示内容", required = true)
    @JsonProperty(value = "format")
    protected List<CustomContent> format;

    @ApiModelProperty(name = "reward_list",value = "奖励名单", required = true)
    @JsonProperty(value = "reward_list")
    protected List<Reward> reward;

    @ApiModelProperty(name = "user_role",value = "用户权限[Visitor,Organizer,Player,Referee],注：只有用户登录状态时才存在")
    @JsonProperty(value = "user_role")
    protected String[] userRole;

    @ApiModelProperty(name = "enroll_status",value = "报名状态")
    @JsonProperty("enroll_status")
    protected boolean enrollStatus;

    @ApiModelProperty(name = "handle_arbitration",value = "是否存在仲裁申请")
    @JsonProperty("handle_arbitration")
    protected boolean handleArbitration;

    @ApiModelProperty(name = "ranking_group",value = "选手排名名单，注：只有比赛状态为结束时才存在")
    @JsonProperty(value = "ranking_group")
    protected List<PlayerRank> ranking;
}
