package com.proyecto.grupofullstack.services;


import com.proyecto.grupofullstack.models.Usuario;

import java.util.List;

public interface usuarioServices {

    List<Usuario> findAll();
    Usuario findById(Long id);
    Usuario Save(Usuario usuario);

}
