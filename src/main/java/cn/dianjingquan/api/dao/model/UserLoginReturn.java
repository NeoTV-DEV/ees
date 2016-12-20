package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-19.
 * ees
 * cn.dianjingquan.api.dao.model.UserLoginReturn
 */
public class UserLoginReturn extends UserSession {
    @JsonProperty("is_whitelist")
    protected boolean isWhiteList;

    @JsonProperty("is_allow_unreg_user")
    protected boolean isAllowUnRegUser;
}
