package org.bedu.proyecto_escuela.mapper;

import org.bedu.proyecto_escuela.dto.*;
import org.bedu.proyecto_escuela.model.Alumno;
import org.bedu.proyecto_escuela.model.Materia;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MateriaMapper {

    MateriaDTO toDTO(Materia model);

    @Mapping(target = "id_materia", ignore = true)
    Materia toModel(CreateMateriaDTO dto);
}
