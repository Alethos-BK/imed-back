package com.unifeso.Imed.domain.utils;

import lombok.Getter;

@Getter
public enum ServicesEnum {
    BLOOD_COLLECTION(1, "Coleta de Sangue"),
    IMAGING(2, "Imagens Médicas"),
    LAB_TESTS(3, "Exames Laboratoriais"),
    VACCINATION(4, "Vacinação"),
    PHYSIOTHERAPY(5, "Fisioterapia"),
    EMERGENCY_CARE(6, "Atendimento de Emergência"),
    SURGERY(7, "Cirurgia"),
    MATERNITY_SERVICES(8, "Serviços de Maternidade"),
    PSYCHOLOGICAL_SUPPORT(9, "Apoio Psicológico"),
    NUTRITIONAL_GUIDANCE(10, "Orientação Nutricional"),
    REHABILITATION(11, "Reabilitação"),
    MEDICATION_DISPENSING(12, "Dispensação de Medicamentos"),
    CHRONIC_DISEASE_MANAGEMENT(13, "Gerenciamento de Doenças Crônicas"),
    TELEMEDICINE(14, "Telemedicina"),
    DENTAL_SERVICES(15, "Serviços Odontológicos"),
    OCCUPATIONAL_HEALTH(16, "Saúde Ocupacional"),
    ENDOSCOPY(17, "Endoscopia"),
    ANESTHESIA_SERVICES(18, "Serviços de Anestesia"),
    ALLERGY_TESTING(19, "Testes de Alergia"),
    PALLIATIVE_CARE(20, "Cuidados Paliativos");

    private int id;
    private String nome;

    ServicesEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
