package org.oopscraft.arch4j.core.user.repository;

import org.oopscraft.arch4j.core.role.repository.RoleEntity;
import org.oopscraft.arch4j.core.role.repository.RoleEntity_;
import org.springframework.data.jpa.domain.Specification;

public class LoginHistorySpecification {

    public static Specification<LoginHistoryEntity> likeUserId(String userId) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(root.get(LoginHistoryEntity_.USER_ID), userId + '%');
    }

    public static Specification<LoginHistoryEntity> likeIpAddress(String ipAddress) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(root.get(LoginHistoryEntity_.IP_ADDRESS), ipAddress + '%');
    }

}