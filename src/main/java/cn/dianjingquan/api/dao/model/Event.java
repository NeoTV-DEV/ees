package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    @JsonProperty("g")
    protected String g;

    @JsonProperty("r")
    protected String r;

    @JsonProperty("n")
    protected String n;

    @JsonProperty("b")
    protected String b;

    @JsonProperty("p1")
    protected String p1;
    @JsonProperty("p2")
    protected String p2;
    @JsonProperty("p3")
    protected String p3;
    @JsonProperty("p4")
    protected String p4;
    @JsonProperty("p5")
    protected String p5;
    @JsonProperty("p6")
    protected String p6;
    @JsonProperty("p7")
    protected String p7;
    @JsonProperty("mr")
    protected String mr;
    @JsonProperty("ms")
    protected String ms;
    @JsonProperty("ma")
    protected String ma;
    @JsonProperty("mb")
    protected String mb;
    @JsonProperty("mt")
    protected String mt;
    @JsonProperty("dh")
    protected String dh;
    @JsonProperty("rn")
    protected String rn;

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
