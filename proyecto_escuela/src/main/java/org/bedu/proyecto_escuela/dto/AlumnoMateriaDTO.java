package org.bedu.proyecto_escuela.dto;

import lombok.Data;

@Data
public class AlumnoMateriaDTO {
    private long id_alumno_materia;
    private long id_alumno;
    private long id_materia;
    private int calificacion;
    private int semestre;
}