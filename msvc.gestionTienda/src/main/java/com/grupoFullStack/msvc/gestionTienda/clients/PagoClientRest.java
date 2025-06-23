package com.grupoFullStack.msvc.gestionTienda.clients;


import com.grupofullstack.msvc.gestionEnvios.msvc.Models.Pago;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PagoClientRest {
    @GetMapping
    List<Pago> listar();
    @GetMapping("/{id}")
    Pago detalle(@PathVariable Long id);

    @GetMapping("/compra/{compraId}")
    Pago pagoPorCompra(@PathVariable Long compraId);

    @PostMapping
    Pago crear(@Valid @RequestBody Pago pago);
}
