package com.unifeso.Imed.domain.symptom.service;

import com.unifeso.Imed.domain.ia.services.IAService;
import com.unifeso.Imed.domain.symptom.dto.SymptomDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SymptomService {
    @Autowired
    private IAService iaService;

    public String obterRedirecionamento(SymptomDTO symptomDTO) {
        StringBuilder prompt = new StringBuilder();

        prompt.append("Paciente: ").append(symptomDTO.getNome()).append("\n")
                .append("Idade: ").append(symptomDTO.getIdade()).append(" anos\n");

        prompt.append("Paciente: ").append(symptomDTO.getNome()).append("\n")
                .append("Idade: ").append(symptomDTO.getIdade()).append(" anos\n");

        prompt.append("Sintomas: ");
        symptomDTO.getSintomas().forEach(sintoma -> prompt.append(sintoma.getName()).append(", "));
        prompt.setLength(prompt.length() - 2); // Remove a última vírgula
        prompt.append("\n");

        prompt.append("Duração dos sintomas: ").append(symptomDTO.getDuracaoSintomas()).append("\n")
                .append("Intensidade dos sintomas (1-10): ").append(symptomDTO.getIntensidadeSintomas()).append("\n");

        if (symptomDTO.getHistoricoMedico() != null && !symptomDTO.getHistoricoMedico().isEmpty()) {
            prompt.append("Histórico médico: ").append(symptomDTO.getHistoricoMedico()).append("\n");
        }

        prompt.append("Com base nos sintomas e no histórico médico fornecido, forneça uma orientação sobre qual "
                + "especialista médico o paciente deve procurar ou se deve buscar atendimento urgente em um pronto-socorro ou hospital. "
                + "Não forneça um diagnóstico ou o nome de uma doença, apenas uma recomendação sobre o tipo de atendimento necessário.");

        prompt.append("Por favor, forneça a resposta em formato de lista e mantenha-a breve.");

        return iaService.obterDirecionamento(prompt.toString());
    }


}
