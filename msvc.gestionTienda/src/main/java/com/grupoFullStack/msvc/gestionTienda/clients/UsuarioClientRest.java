package com.grupoFullStack.msvc.gestionTienda.clients;

import com.grupoFullStack.msvc.gestionTienda.models.GestionUsuario;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name="msvc-gestionUsuario",url="localhost:8080/api/v1/gestionUsuarios")
public interface UsuarioClientRest {

    @GetMapping("/{id}")
    GestionUsuario findById(@PathVariable Long id);

    @GetMapping("/usuario")
    List<GestionUsuario> FindByName(String name);
    @PostMapping
    GestionUsuario save(@RequestBody @Valid GestionUsuario gestionUsuario);
    @DeleteMapping("/{id}")
    GestionUsuario deleteById(@PathVariable Long id);
}
