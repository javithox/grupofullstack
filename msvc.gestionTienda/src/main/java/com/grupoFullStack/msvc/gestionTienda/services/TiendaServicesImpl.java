package com.grupoFullStack.msvc.gestionTienda.services;

import com.grupoFullStack.msvc.gestionTienda.Exceptions.ProductoException;
import com.grupoFullStack.msvc.gestionTienda.models.Producto;
import com.grupoFullStack.msvc.gestionTienda.models.Tienda;
import com.grupoFullStack.msvc.gestionTienda.repository.tiendaRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaServicesImpl {

    @Autowired
    private tiendaRepository tiendaRepository;

    public List<Tienda> findAll() {
        return tiendaRepository.findAll();
    }

    public Producto findById(Long id) {
        return tiendaRepository.findById(id)
                .orElseThrow(() -> new ProductoException("El producto con id:" + id + " no se encuentra en la base de datos"))
                .getProducto();
    }

    public Producto save(Producto producto) {
        try {
            // You probably want to save the producto entity, not recursively call this method!
            // Suppose you have a ProductoRepository, you should use it here.
            // For now, I'll just return the producto as a placeholder.
            // Replace this with the correct repository save call:
            // return productoRepository.save(producto);
            return producto;
        } catch (FeignException ex) {
            throw new ProductoException(ex.getMessage());
        }
    }

    public void deleteById(Long id) {
        // Add logic to delete by id, for example:
        // productoRepository.deleteById(id);
    }
}
