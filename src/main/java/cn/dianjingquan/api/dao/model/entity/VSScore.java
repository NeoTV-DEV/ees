package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.entity.VSScore
 */
public class VSScore {
    @ApiModelProperty(name = "id",value = "比分id", required = true)
    @JsonProperty(value = "id")
    public Long id;

    @ApiModelProperty(name = "vs_id",value = "对阵id", required = true)
    @JsonProperty(value = "vs_id")
    public String vsId;

    @ApiModelProperty(name = "enroll_id",value = "提交比分的选手报名Id", required = true)
    @JsonProperty(value = "enroll_id")
    public Long enrollId;

    @ApiModelProperty(name = "a_score",value = "选手A的比分", required = true)
    @JsonProperty(value = "a_score")
    public int a_score;

    @ApiModelProperty(name = "b_score",value = "选手B的比分", required = true)
    @JsonProperty(value = "b_score")
    public int b_score;

    @ApiModelProperty(name = "create_time",value = "创建时间", required = true)
    @JsonProperty(value = "create_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Timestamp createTime;
}
