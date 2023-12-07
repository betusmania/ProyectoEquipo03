package org.bedu.proyecto_escuela.controller;

import jakarta.validation.Valid;
import org.bedu.proyecto_escuela.dto.AlumnoDTO;
import org.bedu.proyecto_escuela.dto.AlumnoMateriaDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoMateriaDTO;
import org.bedu.proyecto_escuela.service.AlumnoMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alumnomateria")
public class AlumnoMateriaController {

    @Autowired
    private AlumnoMateriaService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AlumnoMateriaDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlumnoMateriaDTO save(@Valid @RequestBody CreateAlumnoMateriaDTO data) {
        return service.save(data);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AlumnoMateriaDTO update(@PathVariable("id") Long id, @Valid @RequestBody CreateAlumnoMateriaDTO data) {
        return service.update(id, data);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
