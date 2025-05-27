package com.ignacio.msvccompras.repositories;

import com.ignacio.msvccompras.models.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}
