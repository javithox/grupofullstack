package com.grupoFullStack.msvc.gestionTienda.clients;

import com.grupofullstack.msvc.gestionEnvios.msvc.Models.Producto;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="msvc-producto",url="localhost:8080/api/v1/tiendas/productos")
public interface ProductoClientRest {
    @GetMapping
    List<Producto> findAll();

    @GetMapping("/{id}")
    List<Producto>findById(@PathVariable Long id);

    @PostMapping
    Producto save(@RequestBody @Valid Producto producto);

    @GetMapping("/nombre")
    Producto findByNombre(String nombre);

    @DeleteMapping("/{id}")
    Producto deleteById(@PathVariable Long id);
}
