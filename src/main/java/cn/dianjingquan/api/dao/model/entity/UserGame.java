package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by tommy on 2017/2/8.
 * ees
 * cn.dianjingquan.api.dao.model.entity.UserGame
 */
public class UserGame {
    @JsonProperty(value = "id",required = true)
    public long id;

    @JsonProperty(value = "uid",required = true)
    public long uid;

    @JsonProperty(value = "m_game_id",required = true)
    public long m_game_id;
}
