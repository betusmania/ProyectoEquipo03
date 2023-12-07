package org.bedu.proyecto_escuela.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateAlumnoMateriaDTO {
    @NotBlank
    @Min(1)
    private long id_alumno;

    @NotBlank
    @Min(1)
    private long id_materia;

    @NotBlank
    @Min(1)
    private int calificacion;

    @NotBlank
    @Min(1)
    private int semestre;
}
