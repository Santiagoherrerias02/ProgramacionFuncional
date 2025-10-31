package org.example.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

}
