package com.grupoFullStack.msvc.gestionTienda.controller;


import com.grupoFullStack.msvc.gestionTienda.models.entities.Tienda;
import com.grupoFullStack.msvc.gestionTienda.services.TiendaServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RequestMapping("api/v1/tienda")
@Validated
@RestController
public class GestionTienda {
    @Autowired
    private TiendaServices tiendaServices;
    @GetMapping("/Tienda")
    public ResponseEntity<Optional<Tienda>> findByIdTienda(Long id){
        return ResponseEntity .status(HttpStatus.OK).body(this.tiendaServices.findByIdTienda(id));
    }
    @GetMapping("/usuario")
    public ResponseEntity<Tienda> findByNombre(String nombre){
        return ResponseEntity .status(HttpStatus.OK).body(this.tiendaServices.findBynombre(nombre));
    }
    @PostMapping
    public ResponseEntity<Tienda> save(Tienda tienda){
        return ResponseEntity .status(HttpStatus.CREATED).body(this.tiendaServices.save(tienda));
    }
    @DeleteMapping("/tienda/{id}")
    public ResponseEntity<Tienda> deleteById(@PathVariable Long id){
        return ResponseEntity .status(HttpStatus.NO_CONTENT).body(this.tiendaServices.deleteById(id));
    }
}
