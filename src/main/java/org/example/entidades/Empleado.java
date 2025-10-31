package org.example.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Empleado {
    private String nombre;
    private String departamento;
    private double salario;
    private int edad;
}
