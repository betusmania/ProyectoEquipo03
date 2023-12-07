package org.bedu.proyecto_escuela.mapper;

import org.bedu.proyecto_escuela.dto.AlumnoMateriaDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoMateriaDTO;
import org.bedu.proyecto_escuela.model.AlumnoMateria;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AlumnoMateriaMapper {

    AlumnoMateriaDTO toDTO(AlumnoMateria model);

    @Mapping(target = "id_alumno_materia", ignore = true)
    AlumnoMateria toModel(CreateAlumnoMateriaDTO dto);
}
