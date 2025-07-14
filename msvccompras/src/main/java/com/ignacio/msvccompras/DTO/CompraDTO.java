package com.ignacio.msvccompras.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class CompraDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String producto;

    @NotNull
    private Integer cantidad;

    @NotNull
    private Double precioTotal;

    @NotNull
    private LocalDateTime fechaCompra;

    @NotNull
    private Long idCliente;
}
