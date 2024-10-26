package com.unifeso.Imed.domain.doctor.dto;

import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.utils.SpecialtyEnum;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Builder
public class DoctorDTO {
    private Long id;
    private String name;
    private float avgScore;
    private List<SpecialtyEnum> specialtys;
    private String urlImage;

    public DoctorDTO(DoctorEntity doctor, String url) {
        this.id = doctor.getId();
        this.name = doctor.getName();
        this.avgScore = doctor.getAvgScore();
        this.specialtys = new ArrayList<>(doctor.getMainSpecialty().ordinal());
        this.specialtys.addAll(doctor.getSpecialtys());
        this.urlImage = url;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }
}
