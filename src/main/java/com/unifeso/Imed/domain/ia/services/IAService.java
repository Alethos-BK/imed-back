package com.unifeso.Imed.domain.ia.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IAService {
    private String openAiApiKey = "";

    private static final String OPENAI_API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=";

    public String obterDirecionamento(String prompt) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> body = new HashMap<>();
        body.put("contents", List.of(
                Map.of(
                        "parts", List.of(
                                Map.of("text", prompt)
                        )
                )
        ));

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(body, headers);
        ResponseEntity<String> response = restTemplate.exchange(OPENAI_API_URL + openAiApiKey, HttpMethod.POST, entity, String.class);

        String responseBody = response.getBody();
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, Object> responseMap = null;
        try {
            responseMap = objectMapper.readValue(responseBody, Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        List<Map<String, Object>> candidates = (List<Map<String, Object>>) responseMap.get("candidates");
        Map<String, Object> content = (Map<String, Object>) candidates.get(0).get("content");
        List<Map<String, Object>> parts = (List<Map<String, Object>>) content.get("parts");

        return (String) parts.get(0).get("text");
    }

}