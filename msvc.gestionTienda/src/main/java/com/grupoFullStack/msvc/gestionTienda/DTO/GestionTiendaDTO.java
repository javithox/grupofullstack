package com.grupoFullStack.msvc.gestionTienda.DTO;

import java.time.LocalDateTime;

public class GestionTiendaDTO {

    private LocalDateTime horaCompra;

    private Integer costo;

    private String nombreCliente;

    private String rutUsuario;

    public GestionTiendaDTO(
            LocalDateTime horaCompra,
            Integer costo,
            String nombreCliente,
            String rutUsuario
    ){
        this.horaCompra=horaCompra;
        this.costo=costo;
        this.nombreCliente=nombreCliente;
        this.rutUsuario=rutUsuario;
    }

}
