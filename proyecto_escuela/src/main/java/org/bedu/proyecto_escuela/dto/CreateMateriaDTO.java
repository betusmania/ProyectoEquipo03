package org.bedu.proyecto_escuela.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateMateriaDTO {
    @NotBlank
    private String materia;

    @Min(1)
    private long id_maestro;
}
