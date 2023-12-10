package org.bedu.proyecto_escuela.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDTO {

    private String code;
    private String message;
    private Object details;
}
