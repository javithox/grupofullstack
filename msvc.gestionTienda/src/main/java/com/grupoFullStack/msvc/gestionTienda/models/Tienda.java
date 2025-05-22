package com.grupoFullStack.msvc.gestionTienda.models;

import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Tienda {

    private String nombre;
    private Producto producto;
    private String direccion;
    private String numeroTienda;
    private LocalDateTime horaApertura;
    private String descripcion;

}
