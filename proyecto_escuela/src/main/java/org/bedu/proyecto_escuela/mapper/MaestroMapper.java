package org.bedu.proyecto_escuela.mapper;

import org.bedu.proyecto_escuela.dto.*;
import org.bedu.proyecto_escuela.model.Maestro;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MaestroMapper {

    MaestroDTO toDTO(Maestro model);

    @Mapping(target = "id_maestro", ignore = true)
    Maestro toModel(CreateMaestroDTO dto);
}
