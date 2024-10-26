package com.unifeso.Imed.domain.nomeDaFeature.repository;

import com.unifeso.Imed.domain.nomeDaFeature.entity.AnyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnyRepository extends JpaRepository<AnyEntity, Long> { }
