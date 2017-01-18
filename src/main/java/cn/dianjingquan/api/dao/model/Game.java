package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.Game
 */
public class Game {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("djq_gameid")
    protected long djqGameId;

    @JsonProperty("name")
    protected String name;

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

    @JsonProperty("short_name")
    protected String shortName;

    @JsonProperty("djq_group_id")
    protected long djqGroupId;

    @JsonProperty("enabled")
    protected boolean enabled;

    @JsonProperty("remark")
    protected String remark;

    @JsonProperty("add_time")
    protected String createdTime;

    @JsonProperty("id_name_type")
    protected String idNameType;

    @JsonProperty("custom_type")
    protected String customType;
}
