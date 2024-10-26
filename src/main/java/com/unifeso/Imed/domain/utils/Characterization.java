package com.unifeso.Imed.domain.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.usuario.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name= "characteristics")
public class Characterization {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @Column(name= "id_genero", nullable = false)
    private IdGeneroEnum idGenero;

    @Column(name= "hobbies", nullable = false)
    private List<HobbiesEnum> hobbies;

    @Column(name= "age_range", nullable = false)
    private AgeRangeEnum ageRange;

    @Column(name= "personality", nullable = false)
    private PersonalityEnum personality;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private UserEntity user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private DoctorEntity doctor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IdGeneroEnum getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(IdGeneroEnum idGenero) {
        this.idGenero = idGenero;
    }

    public List<HobbiesEnum> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<HobbiesEnum> hobbies) {
        this.hobbies = hobbies;
    }

    public AgeRangeEnum getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(AgeRangeEnum ageRange) {
        this.ageRange = ageRange;
    }

    public PersonalityEnum getPersonality() {
        return personality;
    }

    public void setPersonality(PersonalityEnum personality) {
        this.personality = personality;
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
}
