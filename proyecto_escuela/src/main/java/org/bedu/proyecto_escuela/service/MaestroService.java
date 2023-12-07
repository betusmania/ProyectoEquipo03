package org.bedu.proyecto_escuela.service;

import org.bedu.proyecto_escuela.dto.*;
import org.bedu.proyecto_escuela.mapper.MaestroMapper;
import org.bedu.proyecto_escuela.model.Maestro;
import org.bedu.proyecto_escuela.repository.MaestroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaestroService {
    @Autowired
    private MaestroRepository repository;

    @Autowired
    private MaestroMapper mapper;

    public List<MaestroDTO> findAll() {
        return repository
                .findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public MaestroDTO save(CreateMaestroDTO data) {
        Maestro entity = repository.save(mapper.toModel(data));

        return mapper.toDTO(entity);
    }

    public MaestroDTO update(Long id, CreateMaestroDTO data) {
        Optional<Maestro> maestroExistente = repository.findById(id);
        if (maestroExistente.isPresent()) {
            Maestro maestroActual = maestroExistente.get();
            maestroActual.setNombre_maestro(data.getNombre_maestro());
            return mapper.toDTO(repository.save(maestroActual));
        }

        return null;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
