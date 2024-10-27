package com.unifeso.Imed.domain.institution.repository;

import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.institution.entity.InstitutionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstitutionRepository extends JpaRepository<InstitutionEntity, Long> {
    Optional<InstitutionEntity> findById(Long id);


}
