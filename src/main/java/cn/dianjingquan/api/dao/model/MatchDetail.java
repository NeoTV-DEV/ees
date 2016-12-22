package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by tommy on 2016-12-21.
 * ees
 * cn.dianjingquan.api.dao.model.MatchDetail
 */
public class MatchDetail {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("pid")
    protected String pid;

    @JsonProperty("m_game_id")
    protected long gameId;

    @JsonProperty("uid")
    protected long uid;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("icon")
    protected int icon;

    @JsonProperty("icon_url")
    protected String iconUrl;

    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("stages")
    protected int stages;

    @JsonProperty("is_team")
    protected boolean isTeam;

    @JsonProperty("is_open_enroll_list")
    protected boolean isOpenEnrollList;

    @JsonProperty("is_player_referee")
    protected boolean isPlayerReferee;

    @JsonProperty("appoint_referee")
    protected boolean appointReferee;

    @JsonProperty("is_started_notify_player")
    protected boolean isStartedNotifyPlayer;

    @JsonProperty("is_started_notify_referee")
    protected boolean isStartedNotifyReferee;

    @JsonProperty("is_result_change_notify_player")
    protected boolean isResultChangeNotifyPlayer;

    @JsonProperty("show_count")
    protected String showCount;

    @JsonProperty("req_status")
    protected String reqStatus;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("vs_url")
    protected String vsUrl;

    @JsonProperty("create_time")
    protected String createTime;

    @JsonProperty("update_status_time")
    protected String updateStatusTime;

    @JsonProperty("max_enroll_count")
    protected int maxEnrollCount;

    @JsonProperty("enroll_start_time")
    protected long enrollStartTime;

    @JsonProperty("enroll_end_time")
    protected long enrollEndTime;

    @JsonProperty("start_time")
    protected long startTime;

    @JsonProperty("end_time")
    protected long endTime;

    @JsonProperty("format")
    protected String format;

    @JsonProperty("is_pass")
    protected String isPass;

    @JsonProperty("team_players")
    protected int teamPlayers;

    @JsonProperty("team_main_players")
    protected int teamMainPlayers;

    @JsonProperty("team_substitution_players")
    protected int teamSubstitutionPlayers;

    @JsonProperty("is_top")
    protected boolean isTop;

    @JsonProperty("bg_id")
    protected int bgId;

    @JsonProperty("bg_url")
    protected boolean bgUrl;

    @JsonProperty("is_time_setting")
    protected boolean isTimeSetting;

    @JsonProperty("vs_life_cycle")
    protected int vsLifeCycle;

    @JsonProperty("version")
    protected String version;

    @JsonProperty("address")
    protected String address;

    @JsonProperty("create_process")
    protected String createProcess;

    @JsonProperty("is_upload_enroll_list")
    protected boolean isUploadEnrollList;

    @JsonProperty("friendly_created_time")
    protected String friendlyCreatedTime;

    @JsonProperty("last_mode")
    protected String lastMode;

    @JsonProperty("current_countdown")
    protected String currentCountDown;

    @JsonProperty("zone")
    protected String zone;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("verify_id")
    protected int verifyId;

    @JsonProperty("is_handle")
    protected boolean isHandle;

    @JsonProperty("last_stage")
    protected String lastStage;

    @JsonProperty("enroll_count")
    protected int enrollCount;

    @JsonProperty("id_name_type")
    protected String idNameType;

    @JsonProperty("enroll_detail")
    protected List<Enroll> enrollList;

    protected String ruleList;

    protected String rewardList;

    @JsonProperty("ranking_group")
    protected String rankingGroup;

    @JsonProperty("referee_list")
    protected String refereeList;

    @JsonProperty("optional_info_list")
    protected String optionalInfoList;

    @JsonProperty("custom_property_list")
    protected List<CustomProperty> customPropertyList;
}
