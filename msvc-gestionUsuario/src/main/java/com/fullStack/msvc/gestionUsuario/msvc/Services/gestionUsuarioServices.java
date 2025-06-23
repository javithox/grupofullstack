package com.fullStack.msvc.gestionUsuario.msvc.Services;

import com.fullStack.msvc.gestionUsuario.msvc.models.GestionUsuario;

import java.util.List;


public interface gestionUsuarioServices {
    GestionUsuario FindById(Long id);
    List<GestionUsuario> FindByName(String name);
}
