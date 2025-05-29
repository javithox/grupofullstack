package com.grupofullstack.msvc.gestionEnvios.msvc.Models;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Producto {

    private Long id_producto;
    private String nombreProducto;
    private Integer costo;
    private String descripcion;
    private Integer Stock;
    private String tipo_producto;
    private String marca;
    private String modelo;


}
