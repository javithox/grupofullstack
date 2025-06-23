package com.grupoFullStack.msvc.gestionTienda.clients;

import com.grupofullstack.msvc.gestionEnvios.msvc.Models.entities.Envios;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "msvc.gestionEnvios",url = "localHost")
public interface EnvioClientRest {

    @GetMapping("/api/v1/envios/listar")
     List<Envios>listarEnvios();

    @PostMapping
    Envios crear(@RequestBody Envios envio);

    @GetMapping("/envios/{id}")
    Envios obtener(@PathVariable Long id) ;

    @PutMapping("/{id}/estado")
    Envios actualizarEstado(@PathVariable Long id, @RequestBody String estado);

    @DeleteMapping("/{id}")
    void eliminar(@PathVariable Long id);
}
