package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.Error
 */
public class Error {
    @ApiModelProperty(name = "error",value = "错误内容", required = true, dataType = "string")
    @JsonProperty("error")
    protected String content;

    @ApiModelProperty(name = "error_code",value = "错误码", required = true, dataType = "string")
    @JsonProperty("error_code")
    protected String code;

    @ApiModelProperty(name = "error_description",value = "错误描述", required = true, dataType = "string")
    @JsonProperty("error_description")
    protected String description;

    @ApiModelProperty(name = "error_url",value = "错误源地址", required = true, dataType = "string")
    @JsonProperty("error_url")
    protected String url;
}
