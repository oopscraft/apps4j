package org.oopscraft.arch4j.core.user.repository;

import org.oopscraft.arch4j.core.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * UserEntity repository
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>, JpaSpecificationExecutor<UserEntity>, UserRepositorySupport {

}
