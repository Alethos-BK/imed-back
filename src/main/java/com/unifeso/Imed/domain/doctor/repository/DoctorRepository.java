package com.unifeso.Imed.domain.doctor.repository;

import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> { }
