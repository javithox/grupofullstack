package com.grupoFullStack.msvc.gestionTienda.DTO;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TiendaDTO {

    private LocalDateTime horaCompra;

    private Integer costo;

    private String nombreCliente;

    private String rutUsuario;

}
