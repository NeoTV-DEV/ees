package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-19.
 * ees
 * cn.dianjingquan.api.dao.model.UserMsgSettings
 */
public class UserMsgSettings {
    @JsonProperty("uid")
    protected String uid;

    @JsonProperty("isOrgAuditResults")
    protected boolean isOrgAuditResults;

    @JsonProperty("isOrgMaxEnroll")
    protected boolean isOrgMaxEnroll;

    @JsonProperty("isPlayerEnrollSuccess")
    protected boolean isPlayerEnrollSuccess;

    @JsonProperty("isPlayerMatchSuccess")
    protected boolean isPlayerMatchSuccess;
}
