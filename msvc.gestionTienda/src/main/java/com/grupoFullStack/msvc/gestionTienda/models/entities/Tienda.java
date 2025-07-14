package com.grupoFullStack.msvc.gestionTienda.models.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.nio.channels.FileChannel;
import java.time.LocalDateTime;
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@Entity
public class Tienda {
    @Id
    private Long idTienda;
    @NotBlank
    private String nombre;
    @NotBlank
    private String direccion;
    private String numeroTienda;
    private LocalDateTime horaApertura;
    private String descripcion;


}

