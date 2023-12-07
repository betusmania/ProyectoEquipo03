package org.bedu.proyecto_escuela.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

@Getter
@Setter
@ToString
@Entity
@Table(name = "alumnomateria")
public class AlumnoMateria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_alumno_materia;

    @Column(nullable = false)
    @Range(min = 1)
    private long id_alumno;

    @Column(nullable = false)
    @Range(min = 1)
    private long id_materia;

    @Column(nullable = false)
    @Range(min = 1)
    private int calificacion;

    @Column(nullable = false)
    @Range(min = 1)
    private int semestre;
}