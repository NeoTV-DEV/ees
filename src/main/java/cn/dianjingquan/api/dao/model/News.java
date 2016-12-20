package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.News
 */
public class News {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("img_id")
    protected long imgId;

    @JsonProperty("img_url")
    protected String imgUrl;

    @JsonProperty("link")
    protected String link;

    @JsonProperty("type")
    protected int type;

    @JsonProperty("create_time")
    protected long createdTime;

    @JsonProperty("update_time")
    protected long updateTime;

    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("index")
    protected int index;

    @JsonProperty("enabled")
    protected boolean enabled;

    @JsonProperty("author")
    protected String author;

    @JsonProperty("show_time")
    protected long showTime;

    @JsonProperty("is_home")
    protected boolean isHome;

    @JsonProperty("content")
    protected String content;

    @JsonProperty("is_dsl")
    protected boolean isDSL;

    @JsonProperty("top_pos")
    protected int topPos;
}
