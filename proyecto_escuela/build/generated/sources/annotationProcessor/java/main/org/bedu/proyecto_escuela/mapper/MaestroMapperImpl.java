package org.bedu.proyecto_escuela.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.bedu.proyecto_escuela.dto.CreateMaestroDTO;
import org.bedu.proyecto_escuela.dto.MaestroDTO;
import org.bedu.proyecto_escuela.dto.UpdateMaestroDTO;
import org.bedu.proyecto_escuela.model.Maestro;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-09T09:53:07-0600",
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
    public List<MaestroDTO> toDTO(List<Maestro> model) {
        if ( model == null ) {
            return null;
        }

        List<MaestroDTO> list = new ArrayList<MaestroDTO>( model.size() );
        for ( Maestro maestro : model ) {
            list.add( toDTO( maestro ) );
        }

        return list;
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

    @Override
    public void update(Maestro maestro, UpdateMaestroDTO data) {
        if ( data == null ) {
            return;
        }

        maestro.setNombre_maestro( data.getNombre_maestro() );
    }
}
