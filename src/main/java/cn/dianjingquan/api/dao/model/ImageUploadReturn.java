package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-19.
 * ees
 * cn.dianjingquan.api.dao.model.ImageUploadReturn
 */
public class ImageUploadReturn {
    @JsonProperty("code")
    protected long code;

    @JsonProperty("data")
    protected Image data;
}
