package com.fullStack.msvc.gestionUsuario.msvc.Repository;

import com.fullStack.msvc.gestionUsuario.msvc.models.entities.GestionUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface gestionUsuarioRepository extends JpaRepository<GestionUsuario , Long> {
    Long FindById(Long id);

    List<GestionUsuario> FindByname(String name);
}
