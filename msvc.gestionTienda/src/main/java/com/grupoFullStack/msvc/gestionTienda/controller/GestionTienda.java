package com.grupoFullStack.msvc.gestionTienda.controller;

import com.grupoFullStack.msvc.gestionTienda.models.Producto;
import com.grupoFullStack.msvc.gestionTienda.models.Tienda;
import com.grupoFullStack.msvc.gestionTienda.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/gestiontienda")
@Validated
public class GestionTienda {
    @Autowired
    private TiendaRepository tiendaRepository;

    @GetMapping("{producto/id}")
    public ResponseEntity<Optional<Tienda>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(this.tiendaRepository.findById(id));
    }


}
