package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017-1-4.
 * ees
 * cn.dianjingquan.api.dao.model.entity.CustomAttrs
 */
public class CustomAttrs {
    @ApiModelProperty(name = "attr_name",value = "属性名", required = true)
    @JsonProperty(value = "attr_name")
    protected String name;

    @ApiModelProperty(name = "attr_index",value = "索引", required = true)
    @JsonProperty(value = "attr_index")
    protected int index;

    @ApiModelProperty(name = "input_value",value = "输入提示", required = true)
    @JsonProperty(value = "input_value")
    protected String inputValue;

    @ApiModelProperty(name = "attr_type",value = "属性类型", required = true)
    @JsonProperty(value = "attr_type")
    protected String type;

    @ApiModelProperty(name = "attr_regex",value = "属性输入正则验证", required = true)
    @JsonProperty(value = "attr_regex")
    protected String regex;

    @ApiModelProperty(name = "input_type",value = "输入类型", required = true)
    @JsonProperty(value = "input_type")
    protected InputType inputType;

    @ApiModelProperty(name = "is_required",value = "是否必填", required = true)
    @JsonProperty(value = "is_required", defaultValue = "true")
    protected boolean isRequired;

    @ApiModelProperty(name = "default_val",value = "默认值", required = true)
    @JsonProperty(value = "default_val")
    protected String defaultValue;

    @ApiModelProperty(name = "remark",value = "显示名称", required = true)
    @JsonProperty(value = "remark")
    protected String remark;
}
