package com.grupoFullStack.msvc.gestionTienda.services;


import com.grupoFullStack.msvc.gestionTienda.models.Tienda;

import java.util.List;

public interface TiendaServices {

    List<Tienda> findAll();


    Tienda findBynombre(String nombre);




    Tienda save(Tienda tienda);

}