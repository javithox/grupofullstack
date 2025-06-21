package com.proyecto.DTO;

import lombok.*;

@Getter @Setter @ToString @AllArgsConstructor@NoArgsConstructor
public class productoDTO {
    private Long id;
    private String nombre;
    private Integer costo;
    private String modelo;
    private String marca;
}
