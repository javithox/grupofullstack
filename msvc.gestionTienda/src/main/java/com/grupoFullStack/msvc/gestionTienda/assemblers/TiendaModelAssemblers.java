package com.grupoFullStack.msvc.gestionTienda.assemblers;


import com.grupoFullStack.msvc.gestionTienda.controller.GestionTiendav2;
import com.grupoFullStack.msvc.gestionTienda.models.entities.Tienda;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
@Component
public class TiendaModelAssemblers implements RepresentationModelAssembler<Tienda,EntityModel<Tienda>> {



    @Override
    public EntityModel<Tienda> toModel(Tienda entity) {
        return EntityModel.of(
                entity,
                linkTo(methodOn(GestionTiendav2.class).findByNombre(entity.getNombre())).withSelfRel(),
                linkTo(methodOn(GestionTiendav2.class).findByNombre(entity.getNombre())).withRel("Nombre")
        );
    }
}
