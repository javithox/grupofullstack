package com.grupoFullStack.msvc.gestionTienda.controller;


import com.grupoFullStack.msvc.gestionTienda.models.entities.Tienda;
import com.grupoFullStack.msvc.gestionTienda.services.TiendaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tiendas")
@Validated
public class GestionTienda {
    @Autowired
    private TiendaServices tiendaServices;

    @GetMapping
    public ResponseEntity<List<Tienda>>findAll(){
        return ResponseEntity .status(HttpStatus.OK).body(this.tiendaServices.findAll());
    }
    @GetMapping("/usuario")
    public ResponseEntity<Tienda> findByNombre(String nombre){
        return ResponseEntity .status(HttpStatus.OK).body(this.tiendaServices.findBynombre(nombre));
    }

}

