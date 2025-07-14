package com.grupofullstack.msvc.gestionEnvios.msvc.DTO;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class EnvioDTO {

    private LocalDateTime horaCompra;

    private Integer costo;

    private String nombreCliente;

    private String rutUsuario;

    private String NombreTienda;

}
