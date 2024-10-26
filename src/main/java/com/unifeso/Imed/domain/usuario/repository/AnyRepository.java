package com.unifeso.Imed.domain.usuario.repository;

import com.unifeso.Imed.domain.usuario.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnyRepository extends JpaRepository<UserEntity, Long> { }
