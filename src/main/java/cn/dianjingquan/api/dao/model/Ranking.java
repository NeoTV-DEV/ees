package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.dao.model.Ranking
 */
public class Ranking {
    @JsonProperty("name")
    protected String name;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("rank")
    protected List<Rank> rankList;

    @JsonProperty("friendly_name")
    protected String friendlyName;
}
