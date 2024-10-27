package com.unifeso.Imed.domain.institution.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unifeso.Imed.domain.doctor.dto.DoctorDTO;
import com.unifeso.Imed.domain.doctor.dto.DoctorPostDTO;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.institution.entity.InstitutionEntity;
import com.unifeso.Imed.domain.institution.repository.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

//    public List<InstitutionDTO> get() {
//        List<InstitutionDTO> institutionsDTO = new java.util.ArrayList<>(List.of());
//        List<InstitutionEntity> doctors = institutionRepository.findAll();
//        for (InstitutionEntity doctor: doctors) {
//            URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path(INSTITUTION + GET_BY_ID + IMAGE)
//                    .buildAndExpand(doctor.getId()).toUri();
//            String url = uri.toString();
//            institutionsDTO.add(new InstitutionDTO(institution, url));
//        }
//        return doctorsDTO;
//    }

//    public DoctorDTO getById(Long id) {
//        var entity = anyRepository.findById(id);
//        return entity.map(item -> objectMapper.convertValue(item, DoctorDTO.class)).orElseGet(() -> null);
//    }
//
//    public Map<String, String> post(DoctorPostDTO dto) {
//        var entity = objectMapper.convertValue(dto, DoctorEntity.class);
//        var savedEntity = doctorRepository.save(entity);
//        return Map.of("id", savedEntity.getId().toString());
//    }
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
