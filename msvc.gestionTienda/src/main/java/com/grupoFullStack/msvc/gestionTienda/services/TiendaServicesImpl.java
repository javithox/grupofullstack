package com.grupoFullStack.msvc.gestionTienda.services;

import com.grupoFullStack.msvc.gestionTienda.models.Tienda;
import com.grupoFullStack.msvc.gestionTienda.repository.tiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaServicesImpl implements TiendaServices{

    @Autowired
    private tiendaRepository tiendaRepository;

    public List<Tienda> findAll(){return this.tiendaRepository.findAll();}


    @Override
    public Tienda findBynombre(String nombre) {
        return this.tiendaRepository.findByNombre(nombre);
    }


    @Override
    public Tienda save(Tienda tienda) {
        return this.tiendaRepository.save(tienda);
    }



}