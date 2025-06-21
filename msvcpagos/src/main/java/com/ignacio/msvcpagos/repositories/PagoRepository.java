package com.ignacio.msvcpagos.repositories;

import com.ignacio.msvcpagos.models.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PagoRepository extends JpaRepository<Pago, Long> {
    Optional<Pago> findByCompraId(Long compraId);
}
