package org.bedu.proyecto_escuela.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateMaestroDTO {
    @NotBlank
    private String nombre_maestro;
}