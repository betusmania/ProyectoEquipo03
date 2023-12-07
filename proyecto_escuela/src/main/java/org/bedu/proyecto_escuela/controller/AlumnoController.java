package org.bedu.proyecto_escuela.controller;

import jakarta.validation.Valid;
import org.bedu.proyecto_escuela.dto.AlumnoDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoDTO;
import org.bedu.proyecto_escuela.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AlumnoDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlumnoDTO save(@Valid @RequestBody CreateAlumnoDTO data) {
        return service.save(data);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AlumnoDTO update(@PathVariable("id") Long id,@Valid @RequestBody CreateAlumnoDTO data) {
        return service.update(id, data);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}