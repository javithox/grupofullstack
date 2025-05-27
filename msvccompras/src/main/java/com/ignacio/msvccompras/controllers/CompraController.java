package com.ignacio.msvccompras.controllers;

import com.ignacio.msvccompras.models.Compra;
import com.ignacio.msvccompras.services.CompraService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraService service;

    @GetMapping
    public List<Compra> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compra> detalle(@PathVariable Long id) {
        Optional<Compra> compra = service.findById(id);
        return compra.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Compra> crear(@Valid @RequestBody Compra compra) {
        return ResponseEntity.ok(service.save(compra));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
