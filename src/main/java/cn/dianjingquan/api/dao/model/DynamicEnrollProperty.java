package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.dao.model.DynamicEnrollProperty
 */
public class DynamicEnrollProperty {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("match_id")
    protected long matchId;

    @JsonProperty("remark")
    protected String remark;

    @JsonProperty("attr_name")
    protected String attrName;

    @JsonProperty("attr_type")
    protected String attrType;

    @JsonProperty("attr_regex")
    protected String attrRegex;

    @JsonProperty("input_type")
    protected String inputType;

    @JsonProperty("input_values")
    protected String inputValues;

    @JsonProperty("default_val")
    protected String defaultVal;

    @JsonProperty("is_required")
    protected String isRequired;
}
