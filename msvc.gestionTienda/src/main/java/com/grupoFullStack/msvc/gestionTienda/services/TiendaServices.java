package com.grupoFullStack.msvc.gestionTienda.services;


import com.grupoFullStack.msvc.gestionTienda.models.entities.Tienda;

import java.util.List;

public interface TiendaServices {

    List<Tienda> findAll();


    Tienda findBynombre(String nombre);

    Tienda save(Tienda tienda);
    Tienda deleteById(Long id);

}