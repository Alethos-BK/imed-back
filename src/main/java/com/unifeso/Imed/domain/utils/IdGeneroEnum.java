package com.unifeso.Imed.domain.utils;

import lombok.Getter;

@Getter
public enum IdGeneroEnum {
    MASCULINE(1, "Masculino"),
    FEMININE(2, "Feminino"),
    NON_BINARY(3, "Não-binário"),
    GENDERFLUID(4, "Gênero Fluido"),
    GENDERQUEER(5, "Gênero Queer"),
    AGENDER(6, "Agênero"),
    BIGENDER(7, "Bigênero"),
    DEMIGENDER(8, "Demigênero"),
    TWO_SPIRIT(9, "Dois Espíritos"),
    INTERSEX(10, "Intersexo"),
    ANDROGYNOUS(11, "Andrógino"),
    TRANSFEMININE(12, "Transfeminino"),
    TRANSMASCULINE(13, "Transmasculino"),
    POLYGENDER(14, "Poligênero"),
    NEUTROIS(15, "Neutrois"),
    GENDER_NONCONFORMING(16, "Gênero Não Conformante");

    private int id;
    private String nome;

    IdGeneroEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
