package org.bedu.proyecto_escuela.mapper;

import javax.annotation.processing.Generated;
import org.bedu.proyecto_escuela.dto.AlumnoMateriaDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoMateriaDTO;
import org.bedu.proyecto_escuela.model.AlumnoMateria;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-03T13:28:32-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class AlumnoMateriaMapperImpl implements AlumnoMateriaMapper {

    @Override
    public AlumnoMateriaDTO toDTO(AlumnoMateria model) {
        if ( model == null ) {
            return null;
        }

        AlumnoMateriaDTO alumnoMateriaDTO = new AlumnoMateriaDTO();

        alumnoMateriaDTO.setId_alumno_materia( model.getId_alumno_materia() );
        alumnoMateriaDTO.setId_alumno( model.getId_alumno() );
        alumnoMateriaDTO.setId_materia( model.getId_materia() );
        alumnoMateriaDTO.setCalificacion( model.getCalificacion() );
        alumnoMateriaDTO.setSemestre( model.getSemestre() );

        return alumnoMateriaDTO;
    }

    @Override
    public AlumnoMateria toModel(CreateAlumnoMateriaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AlumnoMateria alumnoMateria = new AlumnoMateria();

        alumnoMateria.setId_alumno( dto.getId_alumno() );
        alumnoMateria.setId_materia( dto.getId_materia() );
        alumnoMateria.setCalificacion( dto.getCalificacion() );
        alumnoMateria.setSemestre( dto.getSemestre() );

        return alumnoMateria;
    }
}
