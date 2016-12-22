package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.EventList
 */
public class EventList {
    @JsonProperty("uid")
    protected long uid;

    @JsonProperty("unread")
    protected int unread;

    @JsonProperty("data")
    protected List<Event> data;
}
