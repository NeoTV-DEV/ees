package cn.dianjingquan.api.dao.model.entity;

import cn.dianjingquan.api.dao.model.Referee;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.entity.MatchNameList
 */
public class MatchNameList {
    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected long matchId;

    @ApiModelProperty(name = "referee_list",value = "裁判名单", readOnly = true)
    @JsonProperty(value = "referee_list")
    protected List<Referee> referee;

    @ApiModelProperty(name = "enroll_list",value = "报名名单", readOnly = true)
    @JsonProperty(value = "enroll_list")
    protected List<Enroll> enroll;
}
