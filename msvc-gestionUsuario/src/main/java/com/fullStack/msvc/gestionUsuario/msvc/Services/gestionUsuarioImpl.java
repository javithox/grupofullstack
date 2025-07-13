package com.fullStack.msvc.gestionUsuario.msvc.Services;

import com.fullStack.msvc.gestionUsuario.msvc.Repository.gestionUsuarioRepository;
import com.fullStack.msvc.gestionUsuario.msvc.models.GestionUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class gestionUsuarioImpl implements gestionUsuarioServices{

    @Autowired
    private gestionUsuarioRepository repository;

    @Override
    public GestionUsuario FindById(Long id) {
        return this.repository.FindById(id);
    }

    @Override
    public List<GestionUsuario> FindByName(String name) {
        return this.repository.FindByname(name);
    }

    @Override
    public GestionUsuario save(GestionUsuario gestionUsuario) {
        return this.repository.save(gestionUsuario);
    }

    @Override
    public List<GestionUsuario> findAll(){return this.repository.findAll();}

    @Override
    public Optional<GestionUsuario> findById(Long id){return this.repository.findById(id);}

    @Override
    public GestionUsuario deletedById(Long id) {
        this.repository.deleteById(id);
        return null;
    }
}
