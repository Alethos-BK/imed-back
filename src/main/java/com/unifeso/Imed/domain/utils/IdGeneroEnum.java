package com.unifeso.Imed.domain.utils;

import lombok.Getter;

@Getter
public enum IdGeneroEnum {
    MASCULINE(0, "Masculino"),
    FEMININE(1, "Feminino"),
    NON_BINARY(2, "Não-binário"),
    GENDERFLUID(3, "Gênero Fluido"),
    GENDERQUEER(4, "Gênero Queer"),
    AGENDER(5, "Agênero"),
    BIGENDER(6, "Bigênero"),
    DEMIGENDER(7, "Demigênero"),
    TWO_SPIRIT(8, "Dois Espíritos"),
    INTERSEX(9, "Intersexo"),
    ANDROGYNOUS(10, "Andrógino"),
    TRANSFEMININE(11, "Transfeminino"),
    TRANSMASCULINE(12, "Transmasculino"),
    POLYGENDER(13, "Poligênero"),
    NEUTROIS(14, "Neutrois"),
    GENDER_NONCONFORMING(15, "Gênero Não Conformante");

    private int id;
    private String nome;

    IdGeneroEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
