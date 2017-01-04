package cn.dianjingquan.api.dao.model.body;

import cn.dianjingquan.api.dao.model.Referee;
import cn.dianjingquan.api.dao.model.entity.CustomAttrs;
import cn.dianjingquan.api.dao.model.entity.DoubleRule;
import cn.dianjingquan.api.dao.model.entity.GroupRule;
import cn.dianjingquan.api.dao.model.entity.SingleRule;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.javafx.font.t2k.T2KFactory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by tommy on 2017-1-4.
 * ees
 * cn.dianjingquan.api.dao.model.body.QRule
 */
@ApiModel(value = "body", description = "request json")
public class QRule {
    @ApiModelProperty(name = "m_game_id",value = "游戏id", required = true)
    @JsonProperty(value = "m_game_id")
    protected long gameId;

    @ApiModelProperty(name = "bg_id",value = "赛事背景图id", required = true)
    @JsonProperty(value = "bg_id")
    protected long bgId;

    @ApiModelProperty(name = "icon",value = "游戏图标id", required = true)
    @JsonProperty(value = "icon")
    protected long icon;

    @ApiModelProperty(name = "bg_url",value = "赛事背景图url", required = true)
    @JsonProperty(value = "bg_url")
    protected String bgUrl;

    @ApiModelProperty(name = "icon_url",value = "游戏图标链接url", required = true)
    @JsonProperty(value = "icon_url")
    protected String iconUrl;

    @ApiModelProperty(name = "is_team",value = "个人赛或战队赛", required = true)
    @JsonProperty(value = "is_team", defaultValue = "false")
    protected boolean isTeam;

    @ApiModelProperty(name = "is_time_setting",value = "倒计时开关", required = true)
    @JsonProperty(value = "is_time_setting", defaultValue = "false")
    protected boolean isTimeSetting;

    @ApiModelProperty(name = "enroll_start_time",value = "报名开始时间", required = true)
    @JsonProperty(value = "enroll_start_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Timestamp enrollStartTime;

    @ApiModelProperty(name = "enroll_stop_time",value = "报名结束时间", required = true)
    @JsonProperty(value = "enroll_stop_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Timestamp enrollStopTime;

    @ApiModelProperty(name = "match_start_time",value = "比赛开始时间", required = true)
    @JsonProperty(value = "match_start_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Timestamp startTime;

    @ApiModelProperty(name = "match_stop_time",value = "比赛结束时间", required = true)
    @JsonProperty(value = "match_stop_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Timestamp stopTime;

    @ApiModelProperty(name = "vs_life_cycle",value = "vs生命周期", allowableValues = "1,2,3", required = true)
    @JsonProperty(value = "vs_life_cycle", defaultValue = "1")
    protected int vsLifeCycle;

    @ApiModelProperty(name = "is_player_referee",value = "是否选手自判", required = true)
    @JsonProperty(value = "is_player_referee", defaultValue = "false")
    protected boolean isPlayerReferee;

    @ApiModelProperty(name = "appoint_referee",value = "是否应用裁判", required = true)
    @JsonProperty(value = "appoint_referee", defaultValue = "false")
    protected boolean appointReferee;

    @ApiModelProperty(name = "is_public_enroll",value = "是否公开报名", required = true)
    @JsonProperty(value = "is_public_enroll", defaultValue = "false")
    protected boolean isPublicEnroll;

    @ApiModelProperty(name = "team_main_players",value = "战队主力选手人数", required = true)
    @JsonProperty(value = "team_main_players", defaultValue = "0")
    protected int teamMainPlayers;

    @ApiModelProperty(name = "team_substitution_players",value = "战队替补选手人数", required = true)
    @JsonProperty(value = "team_substitution_players", defaultValue = "0")
    protected int teamSubstitutionPlayers;

    @ApiModelProperty(name = "stages",value = "阶段总数", required = true)
    @JsonProperty(value = "stages")
    protected int stages;

    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected long matchId;

    @ApiModelProperty(name = "uid",value = "用户id", required = true)
    @JsonProperty(value = "uid")
    protected long uid;

    @ApiModelProperty(name = "access_token",value = "token", required = true)
    @JsonProperty(value = "access_token")
    protected String token;

    @ApiModelProperty(name = "referee_list",value = "裁判列表", required = true)
    @JsonProperty(value = "referee_list")
    protected List<Referee> referee;

    @ApiModelProperty(name = "single_rule",value = "单淘赛规则", required = true)
    @JsonProperty(value = "single_rule")
    protected List<SingleRule> singleRule;

    @ApiModelProperty(name = "double_rule",value = "双败赛规则", required = true)
    @JsonProperty(value = "double_rule")
    protected List<DoubleRule> doubleRule;

    @ApiModelProperty(name = "group_rule",value = "小组赛规则", required = true)
    @JsonProperty(value = "group_rule")
    protected List<GroupRule> groupRule;

    @ApiModelProperty(name = "optional_info_list",value = "自定义属性列表", required = true)
    @JsonProperty(value = "optional_info_list")
    protected List<CustomAttrs> optionalList;

}
