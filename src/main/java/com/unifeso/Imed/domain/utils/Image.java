package com.unifeso.Imed.domain.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.usuario.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "image")
public class Image {

    @Id
    @GeneratedValue
    @JsonIgnore
    @Column(name = "id_image")
    private Long id;

    @Lob
    @Column(name = "data")
    private byte[] data;

    @Column(name = "type")
    private String type;

    @JsonIgnore
    @OneToOne(mappedBy = "mainImage", cascade = CascadeType.ALL)
    private DoctorEntity doctor;

    @JsonIgnore
    @OneToOne(mappedBy = "mainImage", cascade = CascadeType.ALL)
    private UserEntity user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DoctorEntity getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorEntity doctor) {
        this.doctor = doctor;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Image(byte[] data, Long id, String type, UserEntity user, DoctorEntity doctor) {
        this.data = data;
        this.id = id;
        this.type = type;
        this.user = user;
        this.doctor = doctor;
    }

    public Image() {
    }
}
