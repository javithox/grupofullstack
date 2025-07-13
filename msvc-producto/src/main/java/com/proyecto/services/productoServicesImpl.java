package com.proyecto.services;


import com.proyecto.exception.productoException;
import com.proyecto.models.Producto;
import com.proyecto.repositories.productoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class productoServicesImpl implements productoServices{
    @Autowired
    private productoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return this.productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return this.productoRepository.findById(id).orElseThrow(
                ()-> new productoException("El producto con id:"+id+"no se encuentra en la base de datos")
        );
    }

    @Override
    public Producto findByNombre(String nombre) {
        return this.productoRepository.findByNombre(nombre);
    }

    @Override
    public Producto save(Producto producto) {
        return this.productoRepository.save(producto);
    }

    @Override
    public Producto deleteById(Long id) {
        this.productoRepository.deleteById(id);
        return null;
    }

}
