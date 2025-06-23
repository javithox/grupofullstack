package com.ignacio.msvcpagos.services;

import com.grupoFullStack.msvc.gestionTienda.models.Pago;


import java.util.List;
import java.util.Optional;

public interface PagoService {
    List<Pago> findAll();
    Optional<Pago> findById(Long id);
    Optional<Pago> findByCompraId(Long compraId);
    Pago save(Pago pago);
    boolean validarPago(Pago pago);
}
