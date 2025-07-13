package com.fullStack.msvc.gestionUsuario.msvc.Services;

import com.fullStack.msvc.gestionUsuario.msvc.models.GestionUsuario;

import java.util.List;
import java.util.Optional;


public interface gestionUsuarioServices {
    GestionUsuario FindById(Long id);
    List<GestionUsuario> FindByName(String name);

    GestionUsuario save(GestionUsuario gestionUsuario);

    List<GestionUsuario> findAll();

    Optional<GestionUsuario> findById(Long id);

    GestionUsuario deletedById(Long id);
}
