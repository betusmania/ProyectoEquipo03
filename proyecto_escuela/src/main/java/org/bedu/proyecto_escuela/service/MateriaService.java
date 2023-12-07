package org.bedu.proyecto_escuela.service;

import org.bedu.proyecto_escuela.dto.AlumnoDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoDTO;
import org.bedu.proyecto_escuela.dto.CreateMateriaDTO;
import org.bedu.proyecto_escuela.dto.MateriaDTO;
import org.bedu.proyecto_escuela.mapper.MateriaMapper;
import org.bedu.proyecto_escuela.model.Alumno;
import org.bedu.proyecto_escuela.model.Materia;
import org.bedu.proyecto_escuela.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository repository;

    @Autowired
    private MateriaMapper mapper;

    public List<MateriaDTO> findAll() {
        return repository
                .findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public MateriaDTO save(CreateMateriaDTO data) {
        Materia entity = repository
                .save(mapper.toModel(data));

        return mapper.toDTO(entity);
    }

    public MateriaDTO update(Long id, CreateMateriaDTO data) {
        Optional<Materia> materiaExistente = repository.findById(id);
        if (materiaExistente.isPresent()) {
            Materia materiaActual = materiaExistente.get();
            materiaActual.setMateria(data.getMateria());
            materiaActual.setId_maestro(data.getId_maestro());
            return mapper.toDTO(repository.save(materiaActual));
        }

        return null;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}