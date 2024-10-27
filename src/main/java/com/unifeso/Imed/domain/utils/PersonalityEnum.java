package com.unifeso.Imed.domain.utils;

import lombok.Getter;

@Getter
public enum PersonalityEnum {
    INTROVERT(0, "Introvertido"),
    EXTROVERT(1, "Extrovertido"),
    AMBIVERT(2, "Ambivertido"),
    THINKER(3, "Pensador"),
    FEELER(4, "Sentidor"),
    JUDGING(5, "Julgador"),
    PERCEIVING(6, "Perceptivo"),
    SENSING(7, "Sensorial"),
    INTUITIVE(8, "Intuitivo"),
    ANALYTICAL(9, "Analítico"),
    CREATIVE(10, "Criativo"),
    PRACTICAL(11, "Prático"),
    OPTIMISTIC(12, "Otimista"),
    PESSIMISTIC(13, "Pessimista"),
    ASSERTIVE(14, "Afirmativo"),
    PASSIVE(15, "Passivo"),
    EMPATHETIC(16, "Empático"),
    RESILIENT(17, "Resiliente"),
    DETERMINED(18, "Determinado"),
    FLEXIBLE(19, "Flexível");

    private int id;
    private String nome;

    PersonalityEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
