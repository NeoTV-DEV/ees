package cn.dianjingquan.api.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.dianjingquan.api.dao.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by tommy on 2016-10-19.
 * user center service
 * cn.dianjingquan.user.dao.repository.
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
