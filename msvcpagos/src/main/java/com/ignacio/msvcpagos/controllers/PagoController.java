package com.ignacio.msvcpagos.controllers;

import com.ignacio.msvcpagos.models.Pago;
import com.ignacio.msvcpagos.services.PagoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    @Autowired
    private PagoService service;

    @GetMapping
    public List<Pago> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pago> detalle(@PathVariable Long id) {
        Optional<Pago> pago = service.findById(id);
        return pago.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/compra/{compraId}")
    public ResponseEntity<Pago> pagoPorCompra(@PathVariable Long compraId) {
        Optional<Pago> pago = service.findByCompraId(compraId);
        return pago.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody Pago pago) {
        pago.setFechaPago(LocalDateTime.now());
        boolean esValido = service.validarPago(pago);
        pago.setValido(esValido);

        if (!esValido) {
            return ResponseEntity.badRequest().body("Pago inválido: monto no coincide o compra no existe.");
        }

        Pago nuevoPago = service.save(pago);
        return ResponseEntity.ok(nuevoPago);
    }
}
