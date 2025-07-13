package com.grupoFullStack.msvc.gestionTienda.DTO;

import java.time.LocalDateTime;

public class TiendaDTO {

    private LocalDateTime horaCompra;

    private Integer costo;

    private String nombreCliente;

    private String rutUsuario;

    public TiendaDTO(
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
