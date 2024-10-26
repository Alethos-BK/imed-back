package com.unifeso.Imed.domain.rating.repository;

import com.unifeso.Imed.domain.rating.entity.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnyRepository extends JpaRepository<RatingEntity, Long> { }
