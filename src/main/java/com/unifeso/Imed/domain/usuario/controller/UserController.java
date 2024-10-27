package com.unifeso.Imed.domain.usuario.controller;

import com.unifeso.Imed.domain.doctor.dto.DoctorDTO;
import com.unifeso.Imed.domain.doctor.dto.DoctorPostDTO;
import com.unifeso.Imed.domain.usuario.dto.UserIADTO;
import com.unifeso.Imed.domain.doctor.service.DoctorService;
import com.unifeso.Imed.domain.utils.Image;
import com.unifeso.Imed.domain.utils.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static com.unifeso.Imed.domain.doctor.controller.constants.DoctorEndpoints.*;

@Slf4j
@RestController
@RequestMapping(DOCTOR)
public class UserController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private DoctorService doctorService;
//    @Autowired
//    private ImageService imageService;

//    @GetMapping(GET_ALL)
//    public ResponseEntity<List<DoctorDTO>> get() {
//        var dto = doctorService.get();
//        return ResponseEntity.of(Optional.of(dto));
//    }
//
//    @GetMapping(GET_BY_ID)
//    public ResponseEntity<DoctorDTO> getById(@PathVariable Long id) {
//        var dto = doctorService.getById(id);
//        return ResponseEntity.of(Optional.of(dto));
//    }
//
//    @GetMapping(GET_BY_ID + IMAGE)
//    public ResponseEntity<byte[]> getImg(@PathVariable Long id) {
//        Optional<Image> image = imageService.getImg(id);
//        if (image.isPresent()) {
//            HttpHeaders headers = new HttpHeaders();
//            headers.add("Content-type", image.get().getType());
//            headers.add("Content-length", String.valueOf(image.get().getData().length));
//            return new ResponseEntity<byte[]>(image.get().getData(), headers, HttpStatus.OK);
//        }
//        return ResponseEntity.notFound().build();
//    }

@PostMapping(POST)
    public ResponseEntity<Object> post(@RequestPart UserIADTO dto) {
       // List<DoctorDTO> = doctorService.get();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
