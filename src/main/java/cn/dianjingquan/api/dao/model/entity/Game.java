package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2017-1-9.
 * ees
 * cn.dianjingquan.api.dao.model.entity.Game
 */
public class Game extends cn.dianjingquan.api.dao.model.Game {
    @JsonProperty("count")
    protected int count;
}
