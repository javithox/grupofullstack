package com.grupoFullStack.msvc.gestionTienda.clients;

import com.grupofullstack.msvc.gestionEnvios.msvc.Models.Compra;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "msvccompras",url = "localhost:8080/api/v1/compra")
public interface CompraClientRest {
    @GetMapping
    List<Compra> listar();
    @GetMapping("/{id}")
    Compra detalle(@PathVariable Long id);

    @PostMapping
    Compra crear(@Valid @RequestBody Compra compra);

    @DeleteMapping("/{id}")
     Void eliminar(@PathVariable Long id);
}
