package com.unifeso.Imed.domain.utils;

import lombok.Getter;

@Getter
public enum AgeRangeEnum {
    AGE_20_30(1, "20 a 30 anos"),
    AGE_30_40(2, "30 a 40 anos"),
    AGE_40_50(3, "40 a 50 anos"),
    AGE_50_60(4, "50 a 60 anos"),
    AGE_60_70(5, "60 a 70 anos"),
    AGE_70_80(6, "70 a 80 anos"),
    AGE_80_90(7, "80 a 90 anos"),
    AGE_90_PLUS(8, "90 anos ou mais");
    //Colocar um campo de data de nascimento e colocar para decidir o grupo a partir disso

    private int id;
    private String nome;

    AgeRangeEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
