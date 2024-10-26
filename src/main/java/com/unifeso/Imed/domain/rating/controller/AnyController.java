package com.unifeso.Imed.domain.rating.controller;

import com.unifeso.Imed.domain.rating.dto.AnyDTO;
import com.unifeso.Imed.domain.rating.service.AnyService;
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
import static com.unifeso.Imed.domain.rating.controller.constants.AnyEndpoints.ANY;
import static com.unifeso.Imed.domain.rating.controller.constants.AnyEndpoints.GET;

@Slf4j
@RestController
@RequestMapping(ANY)
public class AnyController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private AnyService anyService;

    @GetMapping(GET)
    public ResponseEntity<List<AnyDTO>> get(@RequestHeader(TOKEN) String token) {
        var dto = anyService.get();
        return ResponseEntity.of(Optional.of(dto));
    }

    @GetMapping(GET_BY_ID)
    public ResponseEntity<AnyDTO> get(@RequestHeader(TOKEN) String token, @PathVariable(ID) String id) {
        var dto = anyService.getById(Long.valueOf(id));
        return ResponseEntity.of(Optional.of(dto));
    }

    @PostMapping(POST)
    public ResponseEntity<Object> post(@RequestBody AnyDTO dto) {
        var id = anyService.post(dto);
        return new ResponseEntity(id, HttpStatus.CREATED);
    }

    @PutMapping(PUT)
    public ResponseEntity<Void> put(@PathVariable(ID) String id, @RequestBody AnyDTO dto) {
        anyService.put(Long.valueOf(id), dto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping(DELETE)
    public ResponseEntity<Void> delete(@PathVariable(ID) String id) {
        anyService.delete(Long.valueOf(id));
        return new ResponseEntity(HttpStatus.OK);
    }
}
