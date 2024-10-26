package com.unifeso.Imed.domain.rating.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.usuario.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "rating")
public class RatingEntity {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private UserEntity user;

    public RatingEntity(Long id, boolean score, String comment, DoctorEntity doctor, UserEntity user) {
        this.id = id;
        this.score = score;
        this.comment = comment;
        this.doctor = doctor;
        this.user = user;
    }

    public DoctorEntity getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorEntity doctor) {
        this.doctor = doctor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isScore() {
        return score;
    }

    public void setScore(boolean score) {
        this.score = score;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private DoctorEntity doctor;

    @Column(name= "comment", nullable = true)
    private String comment;

    @Column(name= "score", nullable = false)
    private boolean score;
}
