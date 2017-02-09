package cn.dianjingquan.api.dao.model.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017/2/9.
 * ees
 * cn.dianjingquan.api.dao.model.body.QUserPwd
 */
public class QUserPwd {
    @ApiModelProperty(name = "mobile",value = "手机号", required = true)
    @JsonProperty(value = "mobile")
    protected String mobile;

    @ApiModelProperty(name = "pwd",value = "密码", required = true)
    @JsonProperty(value = "pwd")
    protected String pwd;
}
