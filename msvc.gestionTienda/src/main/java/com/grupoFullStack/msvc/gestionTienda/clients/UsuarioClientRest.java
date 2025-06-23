package com.grupoFullStack.msvc.gestionTienda.clients;

import com.grupoFullStack.msvc.gestionTienda.models.GestionUsuario;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@FeignClient(name="msvc-gestionUsuario",url="localhost:8080/api/v1/gestionUsuarios")
public interface UsuarioClientRest {

    @GetMapping("/{id}")
    GestionUsuario findById(@PathVariable Long id);

    @GetMapping("/usuario")
    List<GestionUsuario> FindByName(@PathVariable String name);
    @PostMapping
    GestionUsuario save(@RequestBody @Valid GestionUsuario gestionUsuario);
}
