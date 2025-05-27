package com.ignacio.msvccompras.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compra {

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

    private String estado;
}
