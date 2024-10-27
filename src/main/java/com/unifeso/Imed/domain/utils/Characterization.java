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
    @Column(name = "id_characterization")
    private Long id;

    @Column(name= "id_genero", nullable = true)
    private IdGeneroEnum idGenero;

    @Column(name= "hobbies", nullable = true)
    private List<HobbiesEnum> hobbies;

    @Column(name= "age_range", nullable = true)
    private AgeRangeEnum ageRange;

    @Column(name= "personality", nullable = true)
    private PersonalityEnum personality;

    @OneToOne(mappedBy = "preferences", cascade = CascadeType.ALL)
    private UserEntity user;

    @OneToOne(mappedBy = "characteristics", cascade = CascadeType.ALL)
    private DoctorEntity doctor;

    public Characterization(Long id, IdGeneroEnum idGenero, List<HobbiesEnum> hobbies, AgeRangeEnum ageRange, PersonalityEnum personality, UserEntity user, DoctorEntity doctor) {
        this.id = id;
        this.idGenero = idGenero;
        this.hobbies = hobbies;
        this.ageRange = ageRange;
        this.personality = personality;
        this.user = user;
        this.doctor = doctor;
    }

    public Characterization() {
    }

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
