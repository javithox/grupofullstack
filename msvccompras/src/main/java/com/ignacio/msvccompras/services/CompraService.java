package com.ignacio.msvccompras.services;

import com.ignacio.msvccompras.models.entities.Compra;

import java.util.List;
import java.util.Optional;

public interface CompraService {
    List<Compra> findAll();
    List<Compra> findById(Long id);
    Compra save(Compra compra);
    void deleteById(Long id);

    Object deletedById(Long id);
}
