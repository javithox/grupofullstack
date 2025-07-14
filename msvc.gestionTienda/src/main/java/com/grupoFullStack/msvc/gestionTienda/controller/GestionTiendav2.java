package com.grupoFullStack.msvc.gestionTienda.controller;


import com.grupoFullStack.msvc.gestionTienda.DTO.TiendaDTO;
import com.grupoFullStack.msvc.gestionTienda.assemblers.TiendaModelAssemblers;
import com.grupoFullStack.msvc.gestionTienda.assemblers.TiendaModelDTOAssemblers;
import com.grupoFullStack.msvc.gestionTienda.models.entities.Tienda;
import com.grupoFullStack.msvc.gestionTienda.services.TiendaServices;
import jakarta.validation.Valid;
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
@RequestMapping("/api/v2/tiendas")
@Validated
public class GestionTiendav2 {
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
                linkTo(methodOn(GestionTiendav2.class).findAll()).withSelfRel()
        );
        return ResponseEntity .status(HttpStatus.OK).body(collectionModel);
    }
    @GetMapping("/usuario")
    public ResponseEntity<EntityModel<Tienda>> findByNombre(String nombre){
        EntityModel<Tienda> entityModel=this.tiendaModelAssemblers.toModel(
                this.tiendaServices.findBynombre(nombre)
        );
        return ResponseEntity .status(HttpStatus.OK).body(entityModel);
    }
    @PostMapping
    public ResponseEntity<EntityModel<Tienda>> save(@Valid @RequestBody Tienda tienda){
        Tienda tienda1 =this.tiendaServices.save(tienda);
        EntityModel<Tienda> entityModel=this.tiendaModelAssemblers.toModel(tienda1);
        return ResponseEntity
                .created(linkTo(methodOn(GestionTiendav2.class).findByNombre(tienda1.getNombre())).toUri())
                .body(entityModel);
    }
    @DeleteMapping
    public ResponseEntity<Tienda> deleteById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(this.tiendaServices.deleteById(id));
    }

}

