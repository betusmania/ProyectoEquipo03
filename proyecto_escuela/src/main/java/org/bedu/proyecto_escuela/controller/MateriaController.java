package org.bedu.proyecto_escuela.controller;

import jakarta.validation.Valid;
import org.bedu.proyecto_escuela.dto.*;
import org.bedu.proyecto_escuela.exception.MaestroNotFoundException;
import org.bedu.proyecto_escuela.exception.MateriaNotFoundException;
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
    public MateriaDTO save(@Valid @RequestBody CreateMateriaDTO data) throws MaestroNotFoundException{
        return service.save(data);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") Long id,@Valid @RequestBody UpdateMateriaDTO data) throws MateriaNotFoundException, MaestroNotFoundException {
        service.update(id, data);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id)throws MateriaNotFoundException {
        service.delete(id);
    }
}