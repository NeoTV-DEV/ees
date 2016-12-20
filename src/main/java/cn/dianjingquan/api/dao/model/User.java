package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by tommy on 2016-10-19.
 * user center service
 * cn.dianjingquan.api.dao.model.User
 */
public class User extends UserLoginReturn {
   // @Id
   // @Type(type = "uuid-char")
   // private UUID id;

    @JsonProperty("user_name")
    private String accountName;

    @JsonProperty("nick_name")
    private String nickName;

    @JsonProperty("pwd")
    private String password;

    @JsonProperty("avatar")
    private int avatar;

    @JsonProperty("gender")
    private int gender;

    @JsonProperty("mobile")
    private String mobile;

    @JsonProperty("bg_img")
    private int bgImg;

    @JsonProperty("bg_img_url")
    private String bgImgUrl;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("enabled")
    private boolean enabled = true;

    @JsonProperty("isAuthentication")
    private boolean isAuthentication;

    @JsonProperty("idCard")
    private String idCard;

    @JsonProperty("countryId")
    private int nationality;

    @JsonIgnore
    private Timestamp createTime;

    @JsonIgnore
    private Timestamp updateTime;

    @JsonProperty("is_msg_setting")
    private UserMsgSettings isMsgSetting;
}
