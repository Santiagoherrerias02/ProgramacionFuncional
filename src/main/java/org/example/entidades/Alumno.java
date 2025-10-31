package org.example.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Alumno {
    private String nombre;
    private double nota;
    private String curso;

}
