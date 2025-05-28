package com.grupoFullStack.msvc.gestionTienda.models.entities;

import com.grupoFullStack.msvc.gestionTienda.models.Producto;
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
