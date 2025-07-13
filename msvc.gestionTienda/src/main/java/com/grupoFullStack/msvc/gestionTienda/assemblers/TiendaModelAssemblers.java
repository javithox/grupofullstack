package com.grupoFullStack.msvc.gestionTienda.assemblers;

import com.grupoFullStack.msvc.gestionTienda.controller.GestionTienda;
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
                linkTo(methodOn(GestionTienda.class).findByNombre(entity.getNombre())).withSelfRel(),
                linkTo(methodOn(GestionTienda.class).findAll()).withRel("Tienda")
        );
    }
}
