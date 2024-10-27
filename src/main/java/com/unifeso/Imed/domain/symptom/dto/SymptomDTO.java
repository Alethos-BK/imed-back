package com.unifeso.Imed.domain.symptom.dto;

import com.unifeso.Imed.domain.symptom.enums.SymptomEnum;

import java.util.List;

public class SymptomDTO {

    private Long id;
    private String nome;
    private int idade;
    private List<SymptomEnum> sintomas;
    private String duracaoSintomas;
    private int intensidadeSintomas;
    private String historicoMedico;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public SymptomDTO() {
    }

    public SymptomDTO(Long id, String nome, int idade, List<SymptomEnum> sintomas, String duracaoSintomas, int intensidadeSintomas, String historicoMedico) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sintomas = sintomas;
        this.duracaoSintomas = duracaoSintomas;
        this.intensidadeSintomas = intensidadeSintomas;
        this.historicoMedico = historicoMedico;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<SymptomEnum> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<SymptomEnum> sintomas) {
        this.sintomas = sintomas;
    }

    public String getDuracaoSintomas() {
        return duracaoSintomas;
    }

    public void setDuracaoSintomas(String duracaoSintomas) {
        this.duracaoSintomas = duracaoSintomas;
    }

    public int getIntensidadeSintomas() {
        return intensidadeSintomas;
    }

    public void setIntensidadeSintomas(int intensidadeSintomas) {
        this.intensidadeSintomas = intensidadeSintomas;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
}
