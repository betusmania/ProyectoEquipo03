package org.bedu.proyecto_escuela.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateAlumnoDTO {
    @Min(1)
    @Max(1000)
    private int matricula;

    @NotBlank
    private String nombre_alumno;

    @NotBlank
    private String sexo;

    @NotBlank
    private String telefono;

    @NotBlank
    private String direccion;

    @NotBlank
    private String email;
}