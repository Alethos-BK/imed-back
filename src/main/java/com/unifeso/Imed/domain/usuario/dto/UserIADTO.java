package com.unifeso.Imed.domain.usuario.dto;

import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.utils.SpecialtyEnum;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

public class UserIADTO {
    private Long id;
    private String gender;
    private String age;
    private String hobbies;
    private String personality;

    public UserIADTO(Long id, String gender, String age, String hobbies, String personality) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.hobbies = hobbies;
        this.personality = personality;
    }

    public UserIADTO() {
    }

    public UserIADTO(Long id, String name, String name1, List<String> hobbies) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }
}
