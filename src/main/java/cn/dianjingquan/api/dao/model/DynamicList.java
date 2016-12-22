package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.dao.model.DynamicList
 */
public class DynamicList {
    @JsonProperty("pages")
    protected int pages;

    @JsonProperty("count")
    protected int count;

    @JsonProperty("page")
    protected int page;

    @JsonProperty("page_count")
    protected int pageCount;

    @JsonProperty("data")
    protected List<Event> list;
}
