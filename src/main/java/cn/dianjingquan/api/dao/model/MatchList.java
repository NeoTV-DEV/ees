package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysql.cj.core.LicenseConfiguration;

import java.util.List;

/**
 * Created by tommy on 2016-12-20.
 * ees
 * cn.dianjingquan.api.dao.model.MatchList
 */
public class MatchList {
    @JsonProperty("match_list")
    protected List<MatchListView> data;

    @JsonProperty("enroll_count")
    protected int enrollCount;

    @JsonProperty("start_count")
    protected int startCount;

    @JsonProperty("count")
    protected int count;

    @JsonProperty("pages")
    protected int pages;

    @JsonProperty("page")
    protected int page;
}
