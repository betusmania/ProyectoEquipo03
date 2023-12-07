package org.bedu.proyecto_escuela.controller;

import jakarta.validation.Valid;
import org.bedu.proyecto_escuela.dto.*;
import org.bedu.proyecto_escuela.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("materia")
public class MateriaController {

    @Autowired
    private MateriaService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MateriaDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MateriaDTO save(@Valid @RequestBody CreateMateriaDTO data) {
        return service.save(data);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MateriaDTO update(@PathVariable("id") Long id,@Valid @RequestBody CreateMateriaDTO data) {
        return service.update(id, data);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}