package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-19.
 * ees
 * cn.dianjingquan.api.dao.model.UserSession
 */
public class UserSession {

    @JsonProperty("access_token")
    protected String accessToken;

    @JsonProperty("expires_in")
    protected long expires;

    @JsonProperty("uid")
    protected long uid;

    @JsonProperty("un_procs")
    protected String[] procs;
}
