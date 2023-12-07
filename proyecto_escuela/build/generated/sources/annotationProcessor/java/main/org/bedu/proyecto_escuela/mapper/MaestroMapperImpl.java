package org.bedu.proyecto_escuela.mapper;

import javax.annotation.processing.Generated;
import org.bedu.proyecto_escuela.dto.CreateMaestroDTO;
import org.bedu.proyecto_escuela.dto.MaestroDTO;
import org.bedu.proyecto_escuela.model.Maestro;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-03T12:46:09-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class MaestroMapperImpl implements MaestroMapper {

    @Override
    public MaestroDTO toDTO(Maestro model) {
        if ( model == null ) {
            return null;
        }

        MaestroDTO maestroDTO = new MaestroDTO();

        maestroDTO.setId_maestro( model.getId_maestro() );
        maestroDTO.setNombre_maestro( model.getNombre_maestro() );

        return maestroDTO;
    }

    @Override
    public Maestro toModel(CreateMaestroDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Maestro maestro = new Maestro();

        maestro.setNombre_maestro( dto.getNombre_maestro() );

        return maestro;
    }
}
