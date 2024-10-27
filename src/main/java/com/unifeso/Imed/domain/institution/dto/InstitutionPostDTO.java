package com.unifeso.Imed.domain.institution.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.institution.entity.InstitutionEntity;
import com.unifeso.Imed.domain.utils.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

public class InstitutionPostDTO {
    private Long id;
    private String name;
    private Address address;
    private String type;
    private List<DoctorEntity> doctors;
    private List<ServicesEnum> services;
    private float avgScore;
    private Image mainImage;

    public InstitutionPostDTO() {
    }

    public InstitutionPostDTO(Long id, String name, Address address, String type, List<DoctorEntity> doctors, List<ServicesEnum> services, float avgScore, Image mainImage) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.type = type;
        this.doctors = doctors;
        this.services = services;
        this.avgScore = avgScore;
        this.mainImage = mainImage;
    }

    public Image getMainImage() {
        return mainImage;
    }

    public void setMainImage(Image mainImage) {
        this.mainImage = mainImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DoctorEntity> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<DoctorEntity> doctors) {
        this.doctors = doctors;
    }

    public List<ServicesEnum> getServices() {
        return services;
    }

    public void setServices(List<ServicesEnum> services) {
        this.services = services;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }
}
