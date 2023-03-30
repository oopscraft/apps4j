package org.oopscraft.arch4j.core.property.repository;

import org.oopscraft.arch4j.core.property.Property;
import org.oopscraft.arch4j.core.property.entity.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * PropertyRepository
 */
@Repository
public interface PropertyRepository extends JpaRepository<PropertyEntity, String>, JpaSpecificationExecutor<PropertyEntity> {

}