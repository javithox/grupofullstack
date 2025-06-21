package com.grupoFullStack.msvc.gestionTienda.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long compraId;  // Referencia a la compra que se paga

    @NotNull
    @Positive
    private Double monto;

    @NotNull
    private LocalDateTime fechaPago;

    @NotNull
    private String metodoPago; // ej: "tarjeta", "transferencia"

    @NotNull
    private Boolean valido;  // true si el pago fue validado correctamente
}
