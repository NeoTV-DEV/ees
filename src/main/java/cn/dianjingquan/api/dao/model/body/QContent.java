package cn.dianjingquan.api.dao.model.body;

import cn.dianjingquan.api.dao.model.entity.CustomContent;
import cn.dianjingquan.api.dao.model.entity.Reward;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by tommy on 2017-1-4.
 * ees
 * cn.dianjingquan.api.dao.model.body.QContent
 */
public class QContent {
    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected long matchId;

    @ApiModelProperty(name = "bg_id",value = "赛事背景图id", required = true)
    @JsonProperty(value = "bg_id")
    protected long bgId;

    @ApiModelProperty(name = "bg_url",value = "赛事背景图url", required = true)
    @JsonProperty(value = "bg_url")
    protected String bgUrl;

    @ApiModelProperty(name = "name",value = "比赛名称", required = true)
    @JsonProperty(value = "name")
    protected String name;

    @ApiModelProperty(name = "version",value = "游戏版本", required = true)
    @JsonProperty(value = "version")
    protected String version;

    @ApiModelProperty(name = "summary",value = "比赛简介", required = true)
    @JsonProperty(value = "summary")
    protected String summary;

    @ApiModelProperty(name = "address",value = "比赛地址", required = true)
    @JsonProperty(value = "address")
    protected String address;

    @ApiModelProperty(name = "uid",value = "用户id", required = true)
    @JsonProperty(value = "uid")
    protected long uid;

    @ApiModelProperty(name = "access_token",value = "token", required = true)
    @JsonProperty(value = "access_token")
    protected String token;

    @ApiModelProperty(name = "is_upload_enroll_list",value = "是否上传报名名单", required = true)
    @JsonProperty(value = "is_upload_enroll_list", defaultValue = "false")
    protected boolean isUploadEnrollList;

    @ApiModelProperty(name = "format",value = "自定义显示内容", required = true)
    @JsonProperty(value = "format")
    protected List<CustomContent> format;

    @ApiModelProperty(name = "reward",value = "奖励名单", required = true)
    @JsonProperty(value = "reward")
    protected List<Reward> reward;
}
