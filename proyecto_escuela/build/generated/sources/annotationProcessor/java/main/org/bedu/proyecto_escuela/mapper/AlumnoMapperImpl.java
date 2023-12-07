package org.bedu.proyecto_escuela.mapper;

import javax.annotation.processing.Generated;
import org.bedu.proyecto_escuela.dto.AlumnoDTO;
import org.bedu.proyecto_escuela.dto.CreateAlumnoDTO;
import org.bedu.proyecto_escuela.model.Alumno;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-03T22:37:09-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class AlumnoMapperImpl implements AlumnoMapper {

    @Override
    public AlumnoDTO toDTO(Alumno model) {
        if ( model == null ) {
            return null;
        }

        AlumnoDTO alumnoDTO = new AlumnoDTO();

        alumnoDTO.setId_alumno( model.getId_alumno() );
        alumnoDTO.setMatricula( model.getMatricula() );
        alumnoDTO.setNombre_alumno( model.getNombre_alumno() );
        alumnoDTO.setSexo( model.getSexo() );
        alumnoDTO.setTelefono( model.getTelefono() );
        alumnoDTO.setDireccion( model.getDireccion() );
        alumnoDTO.setEmail( model.getEmail() );

        return alumnoDTO;
    }

    @Override
    public Alumno toModel(CreateAlumnoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Alumno alumno = new Alumno();

        alumno.setMatricula( dto.getMatricula() );
        alumno.setNombre_alumno( dto.getNombre_alumno() );
        alumno.setSexo( dto.getSexo() );
        alumno.setTelefono( dto.getTelefono() );
        alumno.setDireccion( dto.getDireccion() );
        alumno.setEmail( dto.getEmail() );

        return alumno;
    }
}
