package cn.dianjingquan.api.dao.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by tommy on 2016-10-19.
 * user center service
 * cn.dianjingquan.user.dao.model.
 */
@Entity
@Table(name = "user_base")
public class User {
    @Id
    @Type(type = "uuid-char")
    private UUID id;

    private long sn;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "pwd")
    private String password;

    private int avatar;

    private int gender;

    @Column(length = 11)
    private String mobile;

    @Column(name = "bg_img")
    private int bgImg;

    @Column(name = "un_procs")
    private String unProcess;

    private boolean enabled = true;

    @Column(name = "is_push_msg")
    private boolean isPushMsg = true;

    @Column(name = "id_card")
    private String idCard;

    private int nationality;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "update_time")
    private Timestamp updateTime;
}
