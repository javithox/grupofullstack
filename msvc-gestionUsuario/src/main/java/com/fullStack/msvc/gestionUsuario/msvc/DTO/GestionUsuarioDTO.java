package com.fullStack.msvc.gestionUsuario.msvc.DTO;

import com.fullStack.msvc.gestionUsuario.msvc.models.GestionUsuario;
import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class GestionUsuarioDTO {

    private LocalDateTime horaCompra;
    private Integer costo;
    private GestionUsuario gestionUsuario;

}
