package com.grupoFullStack.msvc.gestionTienda.clients;

import com.grupoFullStack.msvc.gestionTienda.models.GestionUsuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="msvc-gestionUsuario",url="localhost:8080/api/v1/gestionUsuarios")
public interface UsuarioClientRest {

    @GetMapping("/{id}")
    GestionUsuario findById(@PathVariable Long id);
}
