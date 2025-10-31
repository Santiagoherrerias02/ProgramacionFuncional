package org.example.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private double precio;

}