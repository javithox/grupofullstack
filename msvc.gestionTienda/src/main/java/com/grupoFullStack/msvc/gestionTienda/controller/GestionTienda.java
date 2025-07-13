package com.grupoFullStack.msvc.gestionTienda.controller;


import com.grupoFullStack.msvc.gestionTienda.assemblers.TiendaModelAssemblers;
import com.grupoFullStack.msvc.gestionTienda.assemblers.TiendaModelDTOAssemblers;
import com.grupoFullStack.msvc.gestionTienda.models.entities.Tienda;
import com.grupoFullStack.msvc.gestionTienda.services.TiendaServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Slf4j
@RestController
@RequestMapping("/api/v1/tiendas")
@Validated
public class GestionTienda {
    @Autowired
    private TiendaServices tiendaServices;
    @Autowired
    private TiendaModelAssemblers tiendaModelAssemblers;
    @Autowired
    private TiendaModelDTOAssemblers tiendaModelDTOAssemblers;
    @GetMapping
    public ResponseEntity<CollectionModel<EntityModel<Tienda>>> findAll(){

        List<EntityModel<Tienda>> entityModels=this.tiendaServices.findAll()
                .stream()
                .map(tiendaModelAssemblers::toModel)
                .toList();
        CollectionModel<EntityModel<Tienda>> collectionModel=CollectionModel.of(
                entityModels,
                linkTo(methodOn(GestionTienda.class).findAll()).withSelfRel()
        );
        return ResponseEntity .status(HttpStatus.OK).body(collectionModel);
    }
    @GetMapping("/usuario")
    public ResponseEntity<Tienda> findByNombre(String nombre){
        return ResponseEntity .status(HttpStatus.OK).body(this.tiendaServices.findBynombre(nombre));
    }

}

