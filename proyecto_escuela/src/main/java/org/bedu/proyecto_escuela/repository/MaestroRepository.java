package org.bedu.proyecto_escuela.repository;

import org.bedu.proyecto_escuela.model.Maestro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaestroRepository extends CrudRepository<Maestro, Long> {
    List<Maestro> findAll();
}
