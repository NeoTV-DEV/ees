package cn.dianjingquan.api.dao.model.entity;

/**
 * Created by tommy on 2017-1-5.
 * ees
 * cn.dianjingquan.api.dao.model.entity.VSPlayerStatus
 */
public enum  VSPlayerStatus {
    None,                             //没有
    AWAIT_SUBMIT,                   //等待提交成绩
    NEED_CONFIRM_RESULT,            //需要确认成绩
    AWAIT_VS_RESULT,               //等待对手确认成绩
    VS_HANDLE_ARBITRATION,          //对手发起仲裁
    OWNER_HANDLE_ARBITRATION,      //我发起仲裁
    AWAIT_UPDATE_VS                //等待更新对阵
}
