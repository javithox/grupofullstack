package com.fullStack.msvc.gestionUsuario.msvc.Services;

import com.fullStack.msvc.gestionUsuario.msvc.models.GestionUsuario;



public interface gestionUsuarioServices {
    GestionUsuario FindById(Long id);
    GestionUsuario FindByName(String name);
}
