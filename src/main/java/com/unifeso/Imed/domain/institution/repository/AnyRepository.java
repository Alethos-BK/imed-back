package com.unifeso.Imed.domain.institution.repository;

import com.unifeso.Imed.domain.institution.entity.InstitutionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnyRepository extends JpaRepository<InstitutionEntity, Long> { }
