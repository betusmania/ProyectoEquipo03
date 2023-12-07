package org.bedu.proyecto_escuela.repository;

import org.bedu.proyecto_escuela.model.Alumno;
import org.bedu.proyecto_escuela.model.Materia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MateriaRepository extends CrudRepository<Materia, Long> {
    List<Materia> findAll();
}