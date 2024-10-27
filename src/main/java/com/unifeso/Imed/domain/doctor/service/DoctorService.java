package com.unifeso.Imed.domain.doctor.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unifeso.Imed.domain.doctor.dto.DoctorDTO;
import com.unifeso.Imed.domain.doctor.dto.DoctorPostDTO;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.doctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.unifeso.Imed.domain.doctor.controller.constants.DoctorEndpoints.*;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private ObjectMapper objectMapper;

    public List<DoctorDTO> get() {
        List<DoctorDTO> doctorsDTO = new java.util.ArrayList<>(List.of());
        List<DoctorEntity> doctors = doctorRepository.findAll();
        for (DoctorEntity doctor: doctors) {
            URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path(DOCTOR + GET_BY_ID + IMAGE)
                    .buildAndExpand(doctor.getId()).toUri();
            String url = uri.toString();
            doctorsDTO.add(new DoctorDTO(doctor, url));
        }
        return doctorsDTO;
    }

//    public DoctorDTO getById(Long id) {
//        var entity = anyRepository.findById(id);
//        return entity.map(item -> objectMapper.convertValue(item, DoctorDTO.class)).orElseGet(() -> null);
//    }
//
    public Map<String, String> post(DoctorPostDTO dto) {
        var entity = objectMapper.convertValue(dto, DoctorEntity.class);
        var savedEntity = doctorRepository.save(entity);
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
