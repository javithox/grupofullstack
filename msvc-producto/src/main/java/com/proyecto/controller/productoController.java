package com.proyecto.controller;

import com.perfulandia.msvc.producto.models.Producto;
import com.perfulandia.msvc.producto.services.productoServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
@Validated
public class productoController {
    @Autowired
    private productoServices productoServices;

    @GetMapping
    public ResponseEntity<List<Producto>> findAll(){
        return ResponseEntity .status(HttpStatus.OK).body(this.productoServices.findAll());

    }
    @GetMapping("/{id}")
    public ResponseEntity<Producto>findById(@PathVariable Long id){
        return ResponseEntity .status(HttpStatus.OK).body(this.productoServices.findById(id));
    }
    @PostMapping
    public ResponseEntity<Producto>save(@RequestBody @Valid Producto producto){
        return ResponseEntity .status(HttpStatus.CREATED).body(this.productoServices.save(producto));
    }
    @GetMapping("/nombre")
    public ResponseEntity<Producto>findByNombre(String nombre){
        return ResponseEntity .status(HttpStatus.OK).body(this.productoServices.findByNombre(nombre));
    }
}
