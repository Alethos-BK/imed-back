package com.unifeso.Imed.domain.doctor.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifeso.Imed.domain.institution.entity.InstitutionEntity;
import com.unifeso.Imed.domain.rating.entity.RatingEntity;
import com.unifeso.Imed.domain.utils.Characterization;
import com.unifeso.Imed.domain.utils.Image;
import com.unifeso.Imed.domain.utils.SpecialtyEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name= "doctor")
public class DoctorEntity {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    public DoctorEntity(Long id, String name, String formacao, String descricao, List<InstitutionEntity> institutions, Characterization characteristics, boolean isRemote, boolean isAtWorkplace, boolean isAtHome, List<RatingEntity> ratings, float avgScore, String crm, List<SpecialtyEnum> specialtys, SpecialtyEnum mainSpecialty, Image mainImage) {
        this.id = id;
        this.name = name;
        this.formacao = formacao;
        this.descricao = descricao;
        this.institutions = institutions;
        this.characteristics = characteristics;
        this.isRemote = isRemote;
        this.isAtWorkplace = isAtWorkplace;
        this.isAtHome = isAtHome;
        this.ratings = ratings;
        this.avgScore = avgScore;
        this.crm = crm;
        this.specialtys = specialtys;
        this.mainSpecialty = mainSpecialty;
        this.mainImage = mainImage;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Image getMainImage() {
        return mainImage;
    }

    public void setMainImage(Image mainImage) {
        this.mainImage = mainImage;
    }

    public SpecialtyEnum getMainSpecialty() {
        return mainSpecialty;
    }

    public void setMainSpecialty(SpecialtyEnum mainSpecialty) {
        this.mainSpecialty = mainSpecialty;
    }

    public List<SpecialtyEnum> getSpecialtys() {
        return specialtys;
    }

    public void setSpecialtys(List<SpecialtyEnum> specialtys) {
        this.specialtys = specialtys;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public List<RatingEntity> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingEntity> ratings) {
        this.ratings = ratings;
    }

    public boolean isAtHome() {
        return isAtHome;
    }

    public void setAtHome(boolean atHome) {
        isAtHome = atHome;
    }

    public boolean isAtWorkplace() {
        return isAtWorkplace;
    }

    public void setAtWorkplace(boolean atWorkplace) {
        isAtWorkplace = atWorkplace;
    }

    public boolean isRemote() {
        return isRemote;
    }

    public void setRemote(boolean remote) {
        isRemote = remote;
    }

    public Characterization getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characterization characteristics) {
        this.characteristics = characteristics;
    }

    public List<InstitutionEntity> getInstitutions() {
        return institutions;
    }

    public void setInstitutions(List<InstitutionEntity> institutions) {
        this.institutions = institutions;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name= "name", nullable = false)
    private String name;

    @Column(name= "formacao", nullable = false)
    private String formacao;

    @Column(name= "descricao", nullable = false)
    private String descricao;

    @ManyToMany
    @JoinTable(name = "doctor_institution",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private List<InstitutionEntity> institutions;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private Characterization characteristics;

    @Column(name= "is_remote", nullable = false)
    private boolean isRemote;

    @Column(name= "is_at_workplace", nullable = false)
    private boolean isAtWorkplace;

    @Column(name= "is_at_home", nullable = false)
    private boolean isAtHome;

    @Column(name= "ratings", nullable = true)
    private List<RatingEntity> ratings;

    @Column(name= "avg_score", nullable = true)
    private float avgScore;

    @Column(name= "crm", nullable = false)
    private String crm;

    @Column(name= "specialtys", nullable = false)
    private List<SpecialtyEnum> specialtys;

    @Column(name= "main_specialty", nullable = false)
    private SpecialtyEnum mainSpecialty;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private Image mainImage;
}
