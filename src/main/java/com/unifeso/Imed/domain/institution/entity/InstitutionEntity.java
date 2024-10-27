package com.unifeso.Imed.domain.institution.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.utils.Address;
import com.unifeso.Imed.domain.utils.Image;
import com.unifeso.Imed.domain.utils.ServicesEnum;
import com.unifeso.Imed.domain.utils.SpecialtyEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name= "institution")
public class InstitutionEntity {

    @Id
    @GeneratedValue
    @JsonIgnore
    @Column(name = "id_institution")
    private Long id;

    @Column(name= "name", nullable = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address", nullable = false)
    private Address address;

    @Column(name= "type", nullable = false)
    private String type;

    @ManyToMany
    @JoinTable(name = "doctor_institution",
            joinColumns = @JoinColumn(name = "id_institution"),
            inverseJoinColumns = @JoinColumn(name = "id_doctor"))
    private List<DoctorEntity> doctors;

    @Column(name= "services", nullable = false)
    private List<ServicesEnum> services;

    @Column(name= "avg_score", nullable = true)
    private float avgScore;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_main_image", nullable = true)
    private Image mainImage;

    public InstitutionEntity() {
    }

    public InstitutionEntity(Long id, String name, Address address, String type, List<DoctorEntity> doctors, List<ServicesEnum> services, float avgScore, Image mainImage) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.type = type;
        this.doctors = doctors;
        this.services = services;
        this.avgScore = avgScore;
        this.mainImage = mainImage;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public Image getMainImage() {
        return mainImage;
    }

    public void setMainImage(Image mainImage) {
        this.mainImage = mainImage;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
}
