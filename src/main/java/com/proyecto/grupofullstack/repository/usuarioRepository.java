package com.proyecto.grupofullstack.repository;

import com.proyecto.grupofullstack.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface usuarioRepository extends JpaRepository<Usuario,Long> {

}
