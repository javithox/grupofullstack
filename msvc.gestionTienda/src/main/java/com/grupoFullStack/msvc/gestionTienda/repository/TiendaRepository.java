package com.grupoFullStack.msvc.gestionTienda.repository;

import com.grupoFullStack.msvc.gestionTienda.models.entities.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda , Long> {

}
