package org.bedu.proyecto_escuela.service;

import org.bedu.proyecto_escuela.dto.AlumnoDTO;
import org.bedu.proyecto_escuela.dto.AlumnoMateriaDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoMateriaDTO;
import org.bedu.proyecto_escuela.mapper.AlumnoMateriaMapper;
import org.bedu.proyecto_escuela.model.Alumno;
import org.bedu.proyecto_escuela.model.AlumnoMateria;
import org.bedu.proyecto_escuela.repository.AlumnoMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoMateriaService {
    @Autowired
    private AlumnoMateriaRepository repository;

    @Autowired
    private AlumnoMateriaMapper mapper;

    public List<AlumnoMateriaDTO> findAll() {
        return repository
                .findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public AlumnoMateriaDTO save(CreateAlumnoMateriaDTO data) {
        AlumnoMateria entity = repository
                .save(mapper.toModel(data));

        return mapper.toDTO(entity);
    }

    public AlumnoMateriaDTO update(Long id, CreateAlumnoMateriaDTO data) {
        Optional<AlumnoMateria> alumnomateriaExistente = repository.findById(id);
        if (alumnomateriaExistente.isPresent()) {
            AlumnoMateria alumnomateriaActual = alumnomateriaExistente.get();
            alumnomateriaActual.setId_alumno(data.getId_alumno());
            alumnomateriaActual.setId_materia(data.getId_materia());
            alumnomateriaActual.setCalificacion(data.getCalificacion());
            alumnomateriaActual.setSemestre(data.getSemestre());
            return mapper.toDTO(repository.save(alumnomateriaActual));
        }

        return null;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
