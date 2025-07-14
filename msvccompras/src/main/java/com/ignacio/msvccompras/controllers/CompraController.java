package com.ignacio.msvccompras.controllers;

import com.ignacio.msvccompras.models.Compra;
import com.ignacio.msvccompras.services.CompraService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<List<Compra>> listar() {
        return ResponseEntity .status(HttpStatus.OK).body(this.service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Compra>> detalle(@PathVariable Long id) {
        return ResponseEntity .status(HttpStatus.OK).body(this.service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Compra> crear(@Valid @RequestBody Compra compra) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(compra));
    }

}

