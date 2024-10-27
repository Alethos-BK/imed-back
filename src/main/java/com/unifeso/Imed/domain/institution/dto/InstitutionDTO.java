package com.unifeso.Imed.domain.institution.dto;

import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.institution.entity.InstitutionEntity;
import com.unifeso.Imed.domain.utils.Address;
import com.unifeso.Imed.domain.utils.ServicesEnum;
import com.unifeso.Imed.domain.utils.SpecialtyEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Builder
public class InstitutionDTO {
    private Long id;
    private String name;
    private float avgScore;
    private List<String> services;
    private List<String> specialtys;
    private String urlImage;

    public InstitutionDTO(InstitutionEntity institution, String url) {
        this.id = institution.getId();
        this.name = institution.getName();
        this.avgScore = institution.getAvgScore();
//        Set<String> specialtySet = new LinkedHashSet<>();

//        for (DoctorEntity doctor : institution.getDoctors()) {
//            specialtySet.add(doctor.getMainSpecialty().getName()); /
//            specialtySet.addAll(doctor.getSpecialtys().stream().map(SpecialtyEnum::getName).collect(Collectors.toList())); // Add other specialties
//        }
//
//        this.specialtys = new ArrayList<>(specialtySet);
        this.urlImage = url;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }
}
