package com.unifeso.Imed.domain.institution.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unifeso.Imed.domain.doctor.dto.DoctorDTO;
import com.unifeso.Imed.domain.doctor.dto.DoctorPostDTO;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.institution.dto.InstitutionDTO;
import com.unifeso.Imed.domain.institution.dto.InstitutionPostDTO;
import com.unifeso.Imed.domain.institution.entity.InstitutionEntity;
import com.unifeso.Imed.domain.institution.repository.InstitutionRepository;
import com.unifeso.Imed.domain.utils.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;

import static com.unifeso.Imed.domain.institution.controller.constants.InstitutionEndpoints.*;

@Service
public class InstitutionService {

    @Autowired
    private InstitutionRepository institutionRepository;
    @Autowired
    private ObjectMapper objectMapper;

    public List<InstitutionDTO> get() {
        List<InstitutionDTO> institutionsDTO = new java.util.ArrayList<>(List.of());
        List<InstitutionEntity> institutions = institutionRepository.findAll();
        for (InstitutionEntity institution: institutions) {
            URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path(INSTITUTION + GET_BY_ID + IMAGE)
                    .buildAndExpand(institution.getId()).toUri();
            String url = uri.toString();
            institutionsDTO.add(new InstitutionDTO(institution, url));
        }
        return institutionsDTO;
    }

//    public DoctorDTO getById(Long id) {
//        var entity = anyRepository.findById(id);
//        return entity.map(item -> objectMapper.convertValue(item, DoctorDTO.class)).orElseGet(() -> null);
//    }
//
    public Map<String, String> post(InstitutionPostDTO dto, MultipartFile file) throws IOException {
        var entity = objectMapper.convertValue(dto, InstitutionEntity.class);
        Image image = new Image();
        image.setType(file.getContentType());
        image.setData(file.getBytes());
        entity.setMainImage(image);
        var savedEntity = institutionRepository.save(entity);
        savedEntity = institutionRepository.save(entity);

        return Map.of("id", savedEntity.getId().toString());
}
//
//    public void put(Long id, DoctorDTO dto) {
//        var entity = objectMapper.convertValue(dto, DoctorEntity.class);
//        entity.setId(id);
//        anyRepository.save(entity);
//    }
//
//    public void delete(Long id) {
//        anyRepository.deleteById(id);
//    }
}
