package org.bedu.proyecto_escuela.mapper;

import javax.annotation.processing.Generated;
import org.bedu.proyecto_escuela.model.Alumno;
import org.bedu.proyecto_escuela.model.AlumnoMateria;
import org.bedu.proyecto_escuela.model.AlumnoMateriaKey;
import org.bedu.proyecto_escuela.model.Materia;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-09T08:43:03-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class AlumnoMateriaMapperImpl implements AlumnoMateriaMapper {

    @Override
    public AlumnoMateria toModel(Long id_alumno, Long id_materia) {
        if ( id_alumno == null && id_materia == null ) {
            return null;
        }

        AlumnoMateria alumnoMateria = new AlumnoMateria();

        if ( id_alumno != null ) {
            if ( alumnoMateria.getId() == null ) {
                alumnoMateria.setId( new AlumnoMateriaKey() );
            }
            longToAlumnoMateriaKey( id_alumno, alumnoMateria.getId() );
            alumnoMateria.setAlumno( longToAlumno( id_alumno ) );
        }
        if ( id_materia != null ) {
            if ( alumnoMateria.getId() == null ) {
                alumnoMateria.setId( new AlumnoMateriaKey() );
            }
            longToAlumnoMateriaKey1( id_materia, alumnoMateria.getId() );
            alumnoMateria.setMateria( longToMateria( id_materia ) );
        }

        return alumnoMateria;
    }

    protected void longToAlumnoMateriaKey(Long long1, AlumnoMateriaKey mappingTarget) {
        if ( long1 == null ) {
            return;
        }

        if ( long1 != null ) {
            mappingTarget.setId_alumno( long1 );
        }
    }

    protected void longToAlumnoMateriaKey1(Long long1, AlumnoMateriaKey mappingTarget) {
        if ( long1 == null ) {
            return;
        }

        if ( long1 != null ) {
            mappingTarget.setId_materia( long1 );
        }
    }

    protected Alumno longToAlumno(Long long1) {
        if ( long1 == null ) {
            return null;
        }

        Alumno alumno = new Alumno();

        if ( long1 != null ) {
            alumno.setId_alumno( long1 );
        }

        return alumno;
    }

    protected Materia longToMateria(Long long1) {
        if ( long1 == null ) {
            return null;
        }

        Materia materia = new Materia();

        if ( long1 != null ) {
            materia.setId_materia( long1 );
        }

        return materia;
    }
}
