package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tommy on 2016-12-22.
 * ees
 * cn.dianjingquan.api.dao.model.Rule
 */
public class Rule {
    @JsonProperty("id")
    protected long id;

    @JsonProperty("match_id")
    protected long matchId;

    @JsonProperty("stage")
    protected int stage;

    @JsonProperty("max_enroll_count")
    protected int maxEnrollCount;

    @JsonProperty("promotion")
    protected int promotion;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("is_lpl")
    protected boolean isLpl;

    @JsonProperty("vs_life_cycle")
    protected int vsLifeCycle;

    @JsonProperty("loop")
    protected int loop;

    @JsonProperty("max_count")
    protected int maxCount;

    @JsonProperty("game_win")
    protected int gameWin;

    @JsonProperty("game_fail")
    protected int gameFail;

    @JsonProperty("game_draw")
    protected int gameDraw;

    @JsonProperty("score_win")
    protected int scoreWin;

    @JsonProperty("score_fail")
    protected int scoreFail;
}
