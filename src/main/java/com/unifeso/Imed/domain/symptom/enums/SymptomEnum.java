package com.unifeso.Imed.domain.symptom.enums;

public enum SymptomEnum  {
    DOR_DE_CABECA(0,"Dor de cabeça"),
    FEBRE(1, "Febre"),
    TOSSE(2, "Tosse"),
    NAUSEA(3, "Náusea"),
    DIFICULDADE_PARA_RESPIRAR(4, "Dificuldade para respirar"),
    DOR_NO_PEITO(5, "Dor no peito"),
    FADIGA(6, "Fadiga");

    private int id;
    private String nome;

    SymptomEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public String getName() {
        return nome;
    }
}