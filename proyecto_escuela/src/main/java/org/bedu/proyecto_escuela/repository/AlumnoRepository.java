package org.bedu.proyecto_escuela.repository;

import org.bedu.proyecto_escuela.model.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
    List<Alumno> findAll();
}
