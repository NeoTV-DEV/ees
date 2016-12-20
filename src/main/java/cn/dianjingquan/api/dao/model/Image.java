package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-19.
 * ees
 * cn.dianjingquan.api.dao.model.Image
 */
public class Image {
    @JsonProperty("file_id")
    protected long id;

    @JsonProperty("ext")
    protected String ext;

    @JsonProperty("file_name")
    protected String fileName;

    @JsonProperty("h")
    protected int height;

    @JsonProperty("w")
    protected int width;

    @JsonProperty("mime")
    protected String mime;

    @JsonProperty("original_name")
    protected String original;

    @JsonProperty("path")
    protected String path;

    @JsonProperty("size")
    protected int size;

    @JsonProperty("source")
    protected int source;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("s_url")
    protected String smallUrl;

    @JsonProperty("m_url")
    protected String normalUrl;

    @JsonProperty("l_url")
    protected String largeUrl;
}
