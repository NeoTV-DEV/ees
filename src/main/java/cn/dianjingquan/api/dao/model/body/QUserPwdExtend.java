package cn.dianjingquan.api.dao.model.body;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by tommy on 2017/2/9.
 * ees
 * cn.dianjingquan.api.dao.model.body.QUserPwdExtend
 */
public class QUserPwdExtend extends QUserPwd {
    @ApiModelProperty(name = "old_pwd",value = "原有密码", required = true)
    @JsonProperty(value = "old_pwd")
    protected String oldPwd;
}
