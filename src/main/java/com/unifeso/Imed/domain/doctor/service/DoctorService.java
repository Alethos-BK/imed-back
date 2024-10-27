package com.unifeso.Imed.domain.doctor.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unifeso.Imed.domain.doctor.dto.DoctorDTO;
import com.unifeso.Imed.domain.doctor.dto.DoctorPostDTO;
import com.unifeso.Imed.domain.doctor.entity.DoctorEntity;
import com.unifeso.Imed.domain.doctor.repository.DoctorRepository;
import com.unifeso.Imed.domain.utils.Image;
import com.unifeso.Imed.domain.utils.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.unifeso.Imed.domain.doctor.controller.constants.DoctorEndpoints.*;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    private ImageRepository imageRepository;
    @Autowired
    private ObjectMapper objectMapper;

    public List<DoctorDTO> get() {
        List<DoctorDTO> doctorsDTO = new java.util.ArrayList<>(List.of());
        List<DoctorEntity> doctors = doctorRepository.findAll();
        for (DoctorEntity doctor: doctors) {
            URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path(DOCTOR + GET_BY_ID + IMAGE)
                    .buildAndExpand(doctor.getMainImage().getId()).toUri();
            String url = uri.toString();
            doctorsDTO.add(new DoctorDTO(doctor, url));
        }
        return doctorsDTO;
    }

    public DoctorDTO getById(Long id) {
        //TODO: tratamento caso não ache por id
        Optional<DoctorEntity> doctor = doctorRepository.findById(id);

        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path(DOCTOR + GET_BY_ID + IMAGE)
                .buildAndExpand(doctor.get().getMainImage().getId()).toUri();
        String url = uri.toString();
        return new DoctorDTO(doctor.get(), url);
    }

//    public DoctorDTO getById(Long id) {
//        var entity = anyRepository.findById(id);
//        return entity.map(item -> objectMapper.convertValue(item, DoctorDTO.class)).orElseGet(() -> null);
//    }
//
    public Map<String, String> post(DoctorPostDTO dto, MultipartFile file) throws IOException {
        var entity = objectMapper.convertValue(dto, DoctorEntity.class);
        Image image = new Image();
        image.setType(file.getContentType());
        image.setData(file.getBytes());
        entity.setMainImage(image);

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
