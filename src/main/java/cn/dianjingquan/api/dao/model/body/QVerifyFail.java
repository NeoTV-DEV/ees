package cn.dianjingquan.api.dao.model.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.body.QVerifyFail
 */
public class QVerifyFail {
    @ApiModelProperty(name = "match_id",value = "比赛id", required = true)
    @JsonProperty(value = "match_id")
    protected long matchId;

    @ApiModelProperty(name = "id",value = "id", required = true)
    @JsonProperty(value = "id")
    protected long id;

    @ApiModelProperty(name = "key",value = "key", required = true)
    @JsonProperty(value = "key")
    protected String key;

    @ApiModelProperty(name = "reason",value = "审核原有", required = true)
    @JsonProperty(value = "reason")
    protected String reason;
}
