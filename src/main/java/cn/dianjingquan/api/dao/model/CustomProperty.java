package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.JsonAdapter;

/**
 * Created by tommy on 2016-12-21.
 * ees
 * cn.dianjingquan.api.dao.model.CustomProperty
 */
public class CustomProperty {
    @JsonProperty("title")
    protected String title;

    @JsonProperty("content")
    protected String content;
}
