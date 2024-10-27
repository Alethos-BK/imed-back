package com.unifeso.Imed.domain.utils;

import lombok.*;

@Getter
public enum SpecialtyEnum {
    CARDIO(0, "Cardiologia"),
    NEURO(1, "Neurologia"),
    ORTHO(2, "Ortopedia"),
    GYNECO(3, "Ginecologia"),
    PEDIATRICS(4, "Pediatria"),
    ONCOLOGY(5, "Oncologia"),
    DERMATOLOGY(6, "Dermatologia"),
    PSYCHIATRY(7, "Psiquiatria"),
    RADIOLOGY(8, "Radiologia"),
    EMERGENCY(9, "Medicina de Emergência"),
    ANESTHESIOLOGY(10, "Anestesiologia"),
    INTERNAL_MEDICINE(11, "Medicina Interna"),
    OPHTHALMOLOGY(12, "Oftalmologia"),
    OTOLARYNGOLOGY(13, "Otorrinolaringologia"),
    UROLOGY(14, "Urologia"),
    GASTROENTEROLOGY(15, "Gastroenterologia"),
    RHEUMATOLOGY(16, "Reumatologia"),
    PATHOLOGY(17, "Patologia"),
    PUBLIC_HEALTH(18, "Saúde Pública"),
    FAMILY_MEDICINE(19, "Medicina de Família");

    private int id;
    private String name;

    SpecialtyEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
