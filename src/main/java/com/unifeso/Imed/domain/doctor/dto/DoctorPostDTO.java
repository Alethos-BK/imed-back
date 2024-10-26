package com.unifeso.Imed.domain.doctor.dto;

import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.institution.entity.InstitutionEntity;
import com.unifeso.Imed.domain.rating.entity.RatingEntity;
import com.unifeso.Imed.domain.utils.Characterization;
import com.unifeso.Imed.domain.utils.Image;
import com.unifeso.Imed.domain.utils.SpecialtyEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Builder
public class DoctorPostDTO {
    private String name;
    private String formacao;
    private String descricao;
    private List<InstitutionEntity> institutions;
    private Characterization characteristics;
    private boolean isRemote;
    private boolean isAtWorkplace;
    private boolean isAtHome;
    private String crm;
    private List<SpecialtyEnum> specialtys;
    private SpecialtyEnum mainSpecialty;
    private Image mainImage;
}
