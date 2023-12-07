package org.bedu.proyecto_escuela.dto;

import lombok.Data;

@Data
public class AlumnoDTO {
    private long id_alumno;
    private int matricula;
    private String nombre_alumno;
    private String sexo;
    private String telefono;
    private String direccion;
    private String email;
}
