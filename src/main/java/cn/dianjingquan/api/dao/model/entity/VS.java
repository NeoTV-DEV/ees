package cn.dianjingquan.api.dao.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.entity.VS
 */
public class VS {
    @ApiModelProperty(name = "vs_life_cycle",value = "vs生命周期", allowableValues = "1,2,3", required = true)
    @JsonProperty(value = "vs_life_cycle", defaultValue = "1")
    protected int vsLifeCycle;

    @ApiModelProperty(name = "vs_countdown",value = "vs倒计时", required = true)
    @JsonProperty("vs_countdown")
    protected double vsCountDown;

    @ApiModelProperty(name = "vs_time",value = "vs开始", readOnly = true, allowableValues = "24,48,72,0")
    @JsonProperty("vs_time")
    protected int vsTime;

    @ApiModelProperty(name = "start_time",value = "vs开始", readOnly = true)
    @JsonProperty("start_time")
    protected String startTime;

    @ApiModelProperty(name = "uid",value = "查询发起人用户id", required = true)
    @JsonProperty(value = "uid")
    protected long uid;

    @ApiModelProperty(name = "enroll_list",value = "选手列表", required = true)
    @JsonProperty(value = "enroll_list")
    protected List<VSEnroll> enrollList;

    @ApiModelProperty(name = "img_list",value = "截图列表", required = true)
    @JsonProperty(value = "img_list")
    protected List<VSImg> imgList;

    @ApiModelProperty(name = "score_list",value = "缓存的待确认比分", required = true)
    @JsonProperty(value = "score_list")
    protected List<VSScore> scoreList;
}
