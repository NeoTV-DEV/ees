package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.entity.
 */
public class MatchVerify {
    @ApiModelProperty(name = "id",value = "审核原因id", required = true)
    @JsonProperty(value = "id")
    protected Long id;

    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected Long match_id;

    @ApiModelProperty(name = "updated_time",value = "更新时间", required = true)
    @JsonProperty(value = "updated_time")
    protected Timestamp updated_time;

    @ApiModelProperty(name = "deny_reason",value = "未通过的原因", required = true)
    @JsonProperty(value = "deny_reason")
    protected String deny_reason;

    @ApiModelProperty(name = "is_handle",value = "是否处理过审核", required = true)
    @JsonProperty(value = "is_handle")
    protected boolean isHandle;
}
