package com.unifeso.Imed.domain.utils;

import lombok.Getter;

@Getter
public enum PersonalityEnum {
    INTROVERT(1, "Introvertido"),
    EXTROVERT(2, "Extrovertido"),
    AMBIVERT(3, "Ambivertido"),
    THINKER(4, "Pensador"),
    FEELER(5, "Sentidor"),
    JUDGING(6, "Julgador"),
    PERCEIVING(7, "Perceptivo"),
    SENSING(8, "Sensorial"),
    INTUITIVE(9, "Intuitivo"),
    ANALYTICAL(10, "Analítico"),
    CREATIVE(11, "Criativo"),
    PRACTICAL(12, "Prático"),
    OPTIMISTIC(13, "Otimista"),
    PESSIMISTIC(14, "Pessimista"),
    ASSERTIVE(15, "Afirmativo"),
    PASSIVE(16, "Passivo"),
    EMPATHETIC(17, "Empático"),
    RESILIENT(18, "Resiliente"),
    DETERMINED(19, "Determinado"),
    FLEXIBLE(20, "Flexível");

    private int id;
    private String nome;

    PersonalityEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
