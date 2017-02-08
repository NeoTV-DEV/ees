package cn.dianjingquan.api.dao.model.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017/2/8.
 * ees
 * cn.dianjingquan.api.dao.model.body.QUserGame
 */
public class QUserGame {
    @ApiModelProperty(name = "uid",value = "比赛id", required = true)
    @JsonProperty(value = "uid")
    protected long uid;

    @ApiModelProperty(name = "access_token",value = "token", required = true)
    @JsonProperty(value = "access_token")
    protected String accessToken;

    @ApiModelProperty(name = "m_game_id",value = "游戏id", required = true)
    @JsonProperty(value = "m_game_id")
    protected long[] gameId;
}
