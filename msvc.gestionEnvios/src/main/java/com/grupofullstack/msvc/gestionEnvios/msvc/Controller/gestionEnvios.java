package com.grupofullstack.msvc.gestionEnvios.msvc.Controller;


import com.grupofullstack.msvc.gestionEnvios.msvc.Models.entities.Envios;
import com.grupofullstack.msvc.gestionEnvios.msvc.Services.gestionEnviosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/envios")
public class gestionEnvios {

    @Autowired
    private gestionEnviosServices service;

    @GetMapping
    public List<Envios> listar() { return service.listarEnvios(); }

    @PostMapping
    public Envios crear(@RequestBody Envios envio) { return service.crearEnvio(envio); }

    @GetMapping("/envios/{id}")
    public Envios obtener(@PathVariable Long id) { return service.obtenerEnvio(id); }

    @PutMapping("/{id}/estado")
    public Envios actualizarEstado(@PathVariable Long id, @RequestBody String estado) {
        return service.actualizarEstado(id, estado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) { service.eliminarEnvio(id); }
}
