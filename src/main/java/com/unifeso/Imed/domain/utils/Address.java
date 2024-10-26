package com.unifeso.Imed.domain.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.usuario.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "address")
public class Address {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @Column(name= "cep", nullable = false)
    private String cep;

    @Column(name= "state", nullable = false)
    private String state;

    @Column(name= "city", nullable = false)
    private String city;

    @Column(name= "neighborhood", nullable = false)
    private String neighborhood;

    @Column(name= "avenue", nullable = false)
    private String avenue;

    @Column(name= "number", nullable = false)
    private String number;

    public Address(Long id, String cep, String state, String city, String neighborhood, String avenue, String ps, String number, UserEntity user, DoctorEntity doctor) {
        this.id = id;
        this.cep = cep;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.avenue = avenue;
        this.ps = ps;
        this.number = number;
        this.user = user;
        this.doctor = doctor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public DoctorEntity getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorEntity doctor) {
        this.doctor = doctor;
    }

    @Column(name= "ps", nullable = false)
    private String ps;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private UserEntity user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private DoctorEntity doctor;
}
