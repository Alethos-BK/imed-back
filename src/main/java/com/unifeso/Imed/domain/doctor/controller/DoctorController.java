package com.unifeso.Imed.domain.doctor.controller;

import com.unifeso.Imed.domain.doctor.dto.DoctorDTO;
import com.unifeso.Imed.domain.doctor.dto.DoctorPostDTO;
import com.unifeso.Imed.domain.doctor.service.DoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.unifeso.Imed.domain.doctor.controller.constants.DoctorEndpoints.*;
import static com.unifeso.Imed.domain.doctor.controller.constants.DoctorHeaders.TOKEN;
import static com.unifeso.Imed.domain.doctor.controller.constants.DoctorPathVariable.ID;

@Slf4j
@RestController
@RequestMapping(DOCTOR)
public class DoctorController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private DoctorService doctorService;

    @GetMapping(GET_ALL)
    public ResponseEntity<List<DoctorDTO>> get() {
        var dto = doctorService.get();
        return ResponseEntity.of(Optional.of(dto));
    }

//    @GetMapping(GET_BY_ID)
//    public ResponseEntity<DoctorDTO> get(@RequestHeader(TOKEN) String token, @PathVariable(ID) String id) {
//        var dto = anyService.getById(Long.valueOf(id));
//        return ResponseEntity.of(Optional.of(dto));
//    }
//
    @PostMapping(POST)
    public ResponseEntity<Object> post(@RequestBody DoctorPostDTO dto) {
        var id = doctorService.post(dto);
        return new ResponseEntity(id, HttpStatus.CREATED);
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
