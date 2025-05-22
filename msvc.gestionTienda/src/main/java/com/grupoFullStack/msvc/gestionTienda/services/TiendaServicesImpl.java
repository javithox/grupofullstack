package com.grupoFullStack.msvc.gestionTienda.services;

import com.grupoFullStack.msvc.gestionTienda.Exceptions.ProductoException;
import com.grupoFullStack.msvc.gestionTienda.models.Producto;
import com.grupoFullStack.msvc.gestionTienda.models.Tienda;
import com.grupoFullStack.msvc.gestionTienda.repository.TiendaRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaServicesImpl {
    @Autowired
    private TiendaRepository tiendaRepository;

    @Autowired
    public List<Tienda> findAll(){
        return this.tiendaRepository.findAll();
    }
    @Autowired
    public Producto findById(Long id){
        return this.tiendaRepository.findById(id).orElseThrow(
                ()-> new ProductoException("El prodcuto con id:"+id+"no se encuentra en la base de datos")
        ).getProducto();
    }
    @Autowired
    public Producto save(Producto producto){
        try{
            return this.save(producto);
        }catch (FeignException ex){
            throw  new ProductoException(ex.getMessage());
        }

    }
}
