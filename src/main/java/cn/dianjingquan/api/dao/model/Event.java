package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.Event
 */
public class Event {
    @JsonProperty("key")
    protected String key;

    @JsonProperty("body")
    protected String body;

    @JsonProperty("bodyColor")
    protected String bodyColor;

    @JsonProperty("postTime")
    protected long postTime;

    @ApiModelProperty(name = "g",value = "游戏名称", readOnly = true)
    @JsonProperty("g")
    protected String g;

    @ApiModelProperty(name = "r",value = "比赛规则", readOnly = true)
    @JsonProperty("r")
    protected String r;

    @ApiModelProperty(name = "n",value = "比赛名称", readOnly = true)
    @JsonProperty("n")
    protected String n;

    @JsonProperty("b")
    protected String b;

    @ApiModelProperty(name = "p1",value = "冠军", readOnly = true)
    @JsonProperty("p1")
    protected String p1;

    @ApiModelProperty(name = "p2",value = "亚军", readOnly = true)
    @JsonProperty("p2")
    protected String p2;

    @ApiModelProperty(name = "p3",value = "季军", readOnly = true)
    @JsonProperty("p3")
    protected String p3;

    @ApiModelProperty(name = "p4",value = "主办方", readOnly = true)
    @JsonProperty("p4")
    protected String p4;

    @ApiModelProperty(name = "p5",value = "裁判", readOnly = true)
    @JsonProperty("p5")
    protected String p5;

    @ApiModelProperty(name = "p6",value = "选手A", readOnly = true)
    @JsonProperty("p6")
    protected String p6;

    @ApiModelProperty(name = "p7",value = "选手B", readOnly = true)
    @JsonProperty("p7")
    protected String p7;

    @ApiModelProperty(name = "mr",value = "轮次", readOnly = true)
    @JsonProperty("mr")
    protected String mr;

    @ApiModelProperty(name = "ms",value = "场次", readOnly = true)
    @JsonProperty("ms")
    protected String ms;

    @ApiModelProperty(name = "ma",value = "选手A比分", readOnly = true)
    @JsonProperty("ma")
    protected String ma;

    @ApiModelProperty(name = "mb",value = "选手B比分", readOnly = true)
    @JsonProperty("mb")
    protected String mb;
    @JsonProperty("mt")
    protected String mt;

    @ApiModelProperty(name = "dh",value = "计时时间", readOnly = true)
    @JsonProperty("dh")
    protected String dh;

    @ApiModelProperty(name = "rn",value = "审核未通过原因", readOnly = true)
    @JsonProperty("rn")
    protected String rn;

    @ApiModelProperty(name = "unread",value = "未读消息", readOnly = true)
    @JsonProperty("unread")
    protected boolean unread;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("friendly_type")
    protected String friendlyType;

    @JsonProperty("event_name")
    protected String eventName;

    @JsonProperty("friendly_event_name")
    protected String friendlyMEventName;

    @JsonProperty("match_id")
    protected String matchId;

    @JsonProperty("game_id")
    protected String gameId;

    @JsonProperty("friendly_date")
    protected String friendlyDate;

    @JsonProperty("vs_id")
    protected String vsId;

    @JsonProperty("goto_url")
    protected String gotoUrl;
    @JsonProperty("ma_color")
    protected String maColor;
    @JsonProperty("mb_color")
    protected String mbColor;
    @JsonProperty("mt_color")
    protected String mtColor;
    @JsonProperty("p6_color")
    protected String p6Color;
    @JsonProperty("p7_color")
    protected String p7Color;
    @JsonProperty("msg")
    protected String msg;
    @JsonProperty("img_id")
    protected String imgId;
    @JsonProperty("img_url")
    protected String imgUrl;
    @JsonProperty("img_url_src")
    protected String imgUrlSrc;
    @JsonProperty("icon_url")
    protected String iconUrl;
    @JsonProperty("icon")
    protected String icon;
}
