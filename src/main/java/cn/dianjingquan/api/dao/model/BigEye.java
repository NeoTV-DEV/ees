package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.BigEye
 */
public class BigEye {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("describe")
    protected String describe;

    @JsonProperty("enable")
    protected boolean enable;

    @JsonProperty("index")
    protected int index;

    @JsonProperty("img_id")
    protected long imgId;

    @JsonProperty("match_id")
    protected long matchId;

    @JsonProperty("img_url")
    protected String imgUrl;
}
