package org.bedu.proyecto_escuela.controller;

import jakarta.validation.Valid;
import org.bedu.proyecto_escuela.dto.AlumnoDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoDTO;
import org.bedu.proyecto_escuela.dto.CreateMaestroDTO;
import org.bedu.proyecto_escuela.dto.MaestroDTO;
import org.bedu.proyecto_escuela.service.MaestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("maestro")
public class MaestroController {

    @Autowired
    private MaestroService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MaestroDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MaestroDTO save(@Valid @RequestBody CreateMaestroDTO data) {
        return service.save(data);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MaestroDTO update(@PathVariable("id") Long id, @Valid @RequestBody CreateMaestroDTO data) {
        return service.update(id, data);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
