package com.unifeso.Imed.domain.usuario.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unifeso.Imed.domain.usuario.dto.AnyDTO;
import com.unifeso.Imed.domain.usuario.entity.UserEntity;
import com.unifeso.Imed.domain.usuario.repository.AnyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AnyService {

    @Autowired
    private AnyRepository anyRepository;
    @Autowired
    private ObjectMapper objectMapper;

    public List<AnyDTO> get() {
        var entities = anyRepository.findAll();
        return entities.stream()
                .map(item -> objectMapper.convertValue(item, AnyDTO.class))
                .collect(Collectors.toList());
    }

    public AnyDTO getById(Long id) {
        var entity = anyRepository.findById(id);
        return entity.map(item -> objectMapper.convertValue(item, AnyDTO.class)).orElseGet(() -> null);
    }

    public Map<String, String> post(AnyDTO dto) {
        var entity = objectMapper.convertValue(dto, UserEntity.class);
        var savedEntity = anyRepository.save(entity);
        return Map.of("id", savedEntity.getId().toString());
    }

    public void put(Long id, AnyDTO dto) {
        var entity = objectMapper.convertValue(dto, UserEntity.class);
        entity.setId(id);
        anyRepository.save(entity);
    }

    public void delete(Long id) {
        anyRepository.deleteById(id);
    }
}
