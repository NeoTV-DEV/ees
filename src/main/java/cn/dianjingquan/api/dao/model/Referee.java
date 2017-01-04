package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.dao.model.Referee
 */
public class Referee implements Serializable {
    @JsonProperty(value = "id",required = true)
    protected long id;

    @JsonProperty(value = "uid",required = true)
    protected long uid;

    @JsonProperty(value = "match_id",required = true)
    protected long matchId;

    @JsonProperty(value = "mobile",required = true)
    protected String mobile;

    @JsonProperty(value = "add_time",required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Timestamp addTime;

    @JsonProperty("nick_name")
    protected String nickName;

    @JsonProperty("country")
    protected int country;
}
