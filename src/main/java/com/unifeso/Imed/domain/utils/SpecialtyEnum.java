package com.unifeso.Imed.domain.utils;

import lombok.*;

@Getter
public enum SpecialtyEnum {
    CARDIO(1, "Cardiologia"),
    NEURO(2, "Neurologia"),
    ORTHO(3, "Ortopedia"),
    GYNECO(4, "Ginecologia"),
    PEDIATRICS(5, "Pediatria"),
    ONCOLOGY(6, "Oncologia"),
    DERMATOLOGY(7, "Dermatologia"),
    PSYCHIATRY(8, "Psiquiatria"),
    RADIOLOGY(9, "Radiologia"),
    EMERGENCY(10, "Medicina de Emergência"),
    ANESTHESIOLOGY(11, "Anestesiologia"),
    INTERNAL_MEDICINE(12, "Medicina Interna"),
    OPHTHALMOLOGY(13, "Oftalmologia"),
    OTOLARYNGOLOGY(14, "Otorrinolaringologia"),
    UROLOGY(15, "Urologia"),
    GASTROENTEROLOGY(16, "Gastroenterologia"),
    RHEUMATOLOGY(17, "Reumatologia"),
    PATHOLOGY(18, "Patologia"),
    PUBLIC_HEALTH(19, "Saúde Pública"),
    FAMILY_MEDICINE(20, "Medicina de Família");

    private int id;
    private String name;

    SpecialtyEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
