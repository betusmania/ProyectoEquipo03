package org.bedu.proyecto_escuela.mapper;

import javax.annotation.processing.Generated;
import org.bedu.proyecto_escuela.dto.CreateMateriaDTO;
import org.bedu.proyecto_escuela.dto.MateriaDTO;
import org.bedu.proyecto_escuela.model.Materia;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-03T13:02:51-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class MateriaMapperImpl implements MateriaMapper {

    @Override
    public MateriaDTO toDTO(Materia model) {
        if ( model == null ) {
            return null;
        }

        MateriaDTO materiaDTO = new MateriaDTO();

        materiaDTO.setId_materia( model.getId_materia() );
        materiaDTO.setMateria( model.getMateria() );
        materiaDTO.setId_maestro( model.getId_maestro() );

        return materiaDTO;
    }

    @Override
    public Materia toModel(CreateMateriaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Materia materia = new Materia();

        materia.setMateria( dto.getMateria() );
        materia.setId_maestro( dto.getId_maestro() );

        return materia;
    }
}
