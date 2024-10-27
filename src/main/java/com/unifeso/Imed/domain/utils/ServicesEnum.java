package com.unifeso.Imed.domain.utils;

import lombok.Getter;

@Getter
public enum ServicesEnum {
    BLOOD_COLLECTION(0, "Coleta de Sangue"),
    IMAGING(1, "Imagens Médicas"),
    LAB_TESTS(2, "Exames Laboratoriais"),
    VACCINATION(3, "Vacinação"),
    PHYSIOTHERAPY(4, "Fisioterapia"),
    EMERGENCY_CARE(5, "Atendimento de Emergência"),
    SURGERY(6, "Cirurgia"),
    MATERNITY_SERVICES(7, "Serviços de Maternidade"),
    PSYCHOLOGICAL_SUPPORT(8, "Apoio Psicológico"),
    NUTRITIONAL_GUIDANCE(9, "Orientação Nutricional"),
    REHABILITATION(10, "Reabilitação"),
    MEDICATION_DISPENSING(11, "Dispensação de Medicamentos"),
    CHRONIC_DISEASE_MANAGEMENT(12, "Gerenciamento de Doenças Crônicas"),
    TELEMEDICINE(13, "Telemedicina"),
    DENTAL_SERVICES(14, "Serviços Odontológicos"),
    OCCUPATIONAL_HEALTH(15, "Saúde Ocupacional"),
    ENDOSCOPY(16, "Endoscopia"),
    ANESTHESIA_SERVICES(17, "Serviços de Anestesia"),
    ALLERGY_TESTING(18, "Testes de Alergia"),
    PALLIATIVE_CARE(19, "Cuidados Paliativos");

    private int id;
    private String nome;

    ServicesEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
