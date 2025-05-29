package com.grupoFullStack.msvc.gestionTienda.repository;

import com.grupoFullStack.msvc.gestionTienda.models.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface tiendaRepository extends JpaRepository<Tienda , Long> {

}
