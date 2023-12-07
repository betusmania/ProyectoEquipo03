package org.bedu.proyecto_escuela.mapper;

import org.bedu.proyecto_escuela.dto.AlumnoDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoDTO;
import org.bedu.proyecto_escuela.model.Alumno;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AlumnoMapper {

    AlumnoDTO toDTO(Alumno model);

    @Mapping(target = "id_alumno", ignore = true)
    Alumno toModel(CreateAlumnoDTO dto);

}