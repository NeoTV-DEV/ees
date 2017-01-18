package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017/1/18.
 * ees
 * cn.dianjingquan.api.dao.model.entity.Image
 */
public class Image {
    @ApiModelProperty(name = "id",value = "图片id", required = true)
    @JsonProperty("id")
    protected long id;

    @ApiModelProperty(name = "fs_id",value = "文件id", required = true)
    @JsonProperty("fs_id")
    protected long fid;

    @ApiModelProperty(name = "file_name",value = "文件名", required = true)
    @JsonProperty("file_name")
    protected String fileName;

    @ApiModelProperty(name = "original_name",value = "源文件名", required = true)
    @JsonProperty("original_name")
    protected String originalName;

    @ApiModelProperty(name = "ext",value = "文件扩展名", required = true)
    @JsonProperty("ext")
    protected String ext;

    @ApiModelProperty(name = "mime",value = "HTTP HEADER Content-Type", required = true)
    @JsonProperty("mime")
    protected String mime;

    @ApiModelProperty(name = "size",value = "文件大小", required = true)
    @JsonProperty("size")
    protected long size;

    @ApiModelProperty(name = "h",value = "图片高度", required = true)
    @JsonProperty("h")
    protected long h;

    @ApiModelProperty(name = "w",value = "图片宽度", required = true)
    @JsonProperty("w")
    protected long w;

    @ApiModelProperty(name = "path",value = "图片路径(json)", required = true)
    @JsonProperty("path")
    protected String path;

    @ApiModelProperty(name = "source",value = "文件源id", required = true)
    @JsonProperty("source")
    protected long source;

    @ApiModelProperty(name = "game_id",value = "游戏id", required = true)
    @JsonProperty("game_id")
    protected long gameId;

    @ApiModelProperty(name = "index",value = "索引位", required = true)
    @JsonProperty("index")
    protected int index;
}
