package com.grupoFullStack.msvc.gestionTienda.services;

import com.grupoFullStack.msvc.gestionTienda.models.Producto;

import java.util.List;

public interface TiendaServices {

    List<Producto> findAll();
    Producto findById(Long id);
    Producto save(Producto producto);
    Producto deleteById(Long id);
}
