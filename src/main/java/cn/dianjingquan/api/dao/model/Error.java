package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.Error
 */
public class Error {
    @JsonProperty("error")
    protected String content;

    @JsonProperty("error_code")
    protected String code;

    @JsonProperty("error_description")
    protected String description;

    @JsonProperty("error_url")
    protected String url;
}
