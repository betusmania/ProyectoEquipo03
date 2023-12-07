package org.bedu.proyecto_escuela.repository;

import org.bedu.proyecto_escuela.model.AlumnoMateria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoMateriaRepository extends CrudRepository<AlumnoMateria, Long> {
    List<AlumnoMateria> findAll();
}
