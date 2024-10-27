package com.unifeso.Imed.domain.doctor.controller;

import com.unifeso.Imed.domain.doctor.dto.DoctorDTO;
import com.unifeso.Imed.domain.doctor.dto.DoctorPostDTO;
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
public class DoctorController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private DoctorService doctorService;
    @Autowired
    private ImageService imageService;

    @GetMapping(GET_ALL)
    public ResponseEntity<List<DoctorDTO>> get() {
        var dto = doctorService.get();
        return ResponseEntity.of(Optional.of(dto));
    }

    @GetMapping(GET_BY_ID)
    public ResponseEntity<DoctorDTO> getById(@PathVariable Long id) {
        var dto = doctorService.getById(id);
        return ResponseEntity.of(Optional.of(dto));
    }

    @GetMapping(GET_BY_ID + IMAGE)
    public ResponseEntity<byte[]> getImg(@PathVariable Long id) {
        Optional<Image> image = imageService.getImg(id);
        if (image.isPresent()) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-type", image.get().getType());
            headers.add("Content-length", String.valueOf(image.get().getData().length));
            return new ResponseEntity<byte[]>(image.get().getData(), headers, HttpStatus.OK);
        }
        return ResponseEntity.notFound().build();
    }

//    @GetMapping(GET_BY_ID)
//    public ResponseEntity<DoctorDTO> get(@RequestHeader(TOKEN) String token, @PathVariable(ID) String id) {
//        var dto = anyService.getById(Long.valueOf(id));
//        return ResponseEntity.of(Optional.of(dto));
//    }
//
@PostMapping(value = POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> post(@RequestPart DoctorPostDTO dto, @RequestPart MultipartFile file) throws IOException {
        var id = doctorService.post(dto, file);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }

//
//    @PutMapping(PUT)
//    public ResponseEntity<Void> put(@PathVariable(ID) String id, @RequestBody DoctorDTO dto) {
//        anyService.put(Long.valueOf(id), dto);
//        return new ResponseEntity(HttpStatus.OK);
//    }
//
//    @DeleteMapping(DELETE)
//    public ResponseEntity<Void> delete(@PathVariable(ID) String id) {
//        anyService.delete(Long.valueOf(id));
//        return new ResponseEntity(HttpStatus.OK);
//    }
}
