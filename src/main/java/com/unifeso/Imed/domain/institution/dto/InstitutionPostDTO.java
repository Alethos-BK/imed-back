package com.unifeso.Imed.domain.institution.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.institution.entity.InstitutionEntity;
import com.unifeso.Imed.domain.utils.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Builder
public class InstitutionPostDTO {
    private Long id;
    private String name;
    private Address address;
    private String type;
    private List<DoctorEntity> doctors;
    private List<ServicesEnum> services;
    private float avgScore;
    private Image mainImage;

    public Image getMainImage() {
        return mainImage;
    }

    public void setMainImage(Image mainImage) {
        this.mainImage = mainImage;
    }
}
