package org.bedu.proyecto_escuela.dto;

import lombok.Data;

@Data
public class MateriaDTO {
    private long id_materia;
    private String materia;
    private long id_maestro;
}
