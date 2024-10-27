package com.unifeso.Imed.domain.institution.dto;

import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.utils.Address;
import com.unifeso.Imed.domain.utils.ServicesEnum;
import com.unifeso.Imed.domain.utils.SpecialtyEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
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
    private Address address;
    private String type;
    private List<DoctorEntity> doctors;
    private List<ServicesEnum> services;
    private List<String> specialtys;
    private String urlImage;

    public InstitutionDTO(DoctorEntity doctor, String url) {
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
