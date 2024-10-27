package com.unifeso.Imed.domain.symptom.controller;

import com.unifeso.Imed.domain.symptom.dto.RespostaDTO;
import com.unifeso.Imed.domain.symptom.dto.SymptomDTO;
import com.unifeso.Imed.domain.symptom.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/symptoms")
public class SymptomController {
    @Autowired
    private SymptomService symptomService;


    @PostMapping
    public ResponseEntity<RespostaDTO> receiveSymptom(@RequestBody SymptomDTO symptomDTO) {
        String resposta = symptomService.obterRedirecionamento(symptomDTO);
        RespostaDTO responseJson = new RespostaDTO(resposta);
        return ResponseEntity.ok(responseJson);    }

}
