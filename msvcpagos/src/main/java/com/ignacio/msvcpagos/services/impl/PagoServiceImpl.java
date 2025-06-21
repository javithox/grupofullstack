package com.ignacio.msvcpagos.services.impl;

import com.ignacio.msvcpagos.clients.CompraClient;
import com.ignacio.msvcpagos.models.Pago;
import com.ignacio.msvcpagos.repositories.PagoRepository;
import com.ignacio.msvcpagos.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    private PagoRepository repository;

    @Autowired
    private CompraClient compraClient;

    @Override
    public List<Pago> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Pago> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<Pago> findByCompraId(Long compraId) {
        return repository.findByCompraId(compraId);
    }

    @Override
    public Pago save(Pago pago) {
        return repository.save(pago);
    }

    @Override
    public boolean validarPago(Pago pago) {
        // Validar que la compra exista y que el monto coincida
        CompraClient.CompraResponse compra = compraClient.getCompraById(pago.getCompraId());
        if (compra == null) {
            return false; // compra no existe
        }
        if (!compra.total.equals(pago.getMonto())) {
            return false; // monto no coincide
        }
        // Podés agregar otras validaciones, ej. estado de compra, usuario, etc.
        return true;
    }
}
