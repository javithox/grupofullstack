package com.proyecto.grupofullstack.services;

import com.proyecto.grupofullstack.Exceptions.UsuarioException;
import com.proyecto.grupofullstack.models.Usuario;
import com.proyecto.grupofullstack.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioServicesImpl implements  usuarioServices{
    @Autowired
    private usuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll(){
        return this.usuarioRepository.findAll();
    }
    @Override
    public Usuario findById(Long id){
        return this.usuarioRepository.findById(id).orElseThrow(
                ()->new UsuarioException("Usuario con id:"+id+"no se encuentra en la base de datos")
        );
    }

    @Override
    public Usuario Save(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }
}
