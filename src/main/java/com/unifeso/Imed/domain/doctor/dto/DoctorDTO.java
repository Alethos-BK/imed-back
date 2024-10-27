package com.unifeso.Imed.domain.doctor.dto;

import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.utils.Image;
import com.unifeso.Imed.domain.utils.SpecialtyEnum;
import lombok.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Builder
public class DoctorDTO {
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

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public List<String> getSpecialtys() {
        return specialtys;
    }

    public void setSpecialtys(List<String> specialtys) {
        this.specialtys = specialtys;
    }

    private Long id;
    private String name;
    private float avgScore;
    private List<String> specialtys;
    private String urlImage;

    public DoctorDTO(DoctorEntity doctor, String url) {
        this.id = doctor.getId();
        this.name = doctor.getName();
        this.avgScore = doctor.getAvgScore();
        this.specialtys = AddMainSpecialty(doctor.getMainSpecialty(), doctor.getSpecialtys());
        this.urlImage = url;
    }

    private List<String> AddMainSpecialty(SpecialtyEnum specialty, List<SpecialtyEnum> specialties) {
        specialties.addFirst(specialty);
        return specialties.stream().map(SpecialtyEnum::getName).collect(Collectors.toList());
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }
}
