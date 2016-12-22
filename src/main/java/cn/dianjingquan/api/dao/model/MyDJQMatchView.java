package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.MyDJQMatchView
 */
public class MyDJQMatchView {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("djq_gameid")
    protected long gameId;

    @JsonProperty("djq_group_id")
    protected long groupId;

    @JsonProperty("enabled")
    protected boolean enabled;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("short_name")
    protected String shortName;

    @JsonProperty("en_name")
    protected String enName;

    @JsonProperty("img_id")
    protected long imgId;

    @JsonProperty("img_url")
    protected String imgUrl;

    @JsonProperty("thumbnail_id")
    protected long thumbnailId;

    @JsonProperty("thumbnail_url")
    protected String thumbnailUrl;

    @JsonProperty("remark")
    protected String remark;

    @JsonProperty("add_time")
    protected String addTime;

    @JsonProperty("custom_type")
    protected String customType;

    @JsonProperty("id_name_type")
    protected String idNameType;
}
