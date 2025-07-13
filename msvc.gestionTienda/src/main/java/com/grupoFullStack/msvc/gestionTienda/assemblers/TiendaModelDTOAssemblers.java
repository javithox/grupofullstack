package com.grupoFullStack.msvc.gestionTienda.assemblers;


import com.grupoFullStack.msvc.gestionTienda.DTO.TiendaDTO;
import com.grupoFullStack.msvc.gestionTienda.controller.GestionTienda;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class TiendaModelDTOAssemblers implements RepresentationModelAssembler<TiendaDTO, EntityModel<TiendaDTO>> {

    @Override
    public EntityModel<TiendaDTO> toModel(TiendaDTO entity) {
        return EntityModel.of(
                entity,
                linkTo(methodOn(GestionTienda.class).findAll()).withRel("Tienda")
        );
    }
}
