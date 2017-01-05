package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.entity.VSImg
 */
public class VSImg {
    @ApiModelProperty(name = "id",value = "id", required = true)
    @JsonProperty(value = "id")
    protected long id;

    @ApiModelProperty(name = "uid",value = "上传图片的用户id", required = true)
    @JsonProperty(value = "uid")
    protected long uid;

    @ApiModelProperty(name = "img_id",value = "图片id", required = true)
    @JsonProperty(value = "img_id")
    protected long imgId;

    @ApiModelProperty(name = "img_url",value = "图片url", required = true)
    @JsonProperty(value = "img_url")
    protected String imgUrl;

    @ApiModelProperty(name = "img_url_src",value = "图片源图url", required = true)
    @JsonProperty(value = "img_url_src")
    protected String imgUrlSrc;

    @ApiModelProperty(name = "img_name",value = "图片名", required = true)
    @JsonProperty(value = "img_name")
    protected String imgName;

    @ApiModelProperty(name = "enable",value = "是否禁用", required = true)
    @JsonProperty(value = "enable")
    protected boolean enable;

    @ApiModelProperty(name = "create_time",value = "创建时间", required = true)
    @JsonProperty(value = "create_time")
    protected String createTime;
}
