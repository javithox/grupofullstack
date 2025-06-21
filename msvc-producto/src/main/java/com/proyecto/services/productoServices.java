package com.proyecto.services;

import com.perfulandia.msvc.producto.models.Producto;

import java.util.List;

public interface productoServices {
    List<Producto> findAll();
    Producto findById(Long id);
    Producto findByNombre(String nombre);
    Producto save(Producto producto);

}
