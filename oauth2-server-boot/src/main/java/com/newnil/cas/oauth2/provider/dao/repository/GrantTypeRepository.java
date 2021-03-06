package com.newnil.cas.oauth2.provider.dao.repository;

import com.newnil.cas.oauth2.provider.dao.entity.GrantTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GrantTypeRepository extends JpaRepository<GrantTypeEntity, Long> {

    Optional<GrantTypeEntity> findOneByValue(String value);
}
