package cn.mingming.borrowbooks.dao.repository;

import cn.mingming.borrowbooks.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author carey
 * @date 2019/4/11
 */
@Repository
public interface UserRespository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmailAndPasswordAndIsDeleted(String email, String password, Integer isDeleted);
}
