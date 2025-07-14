package com.ignacio.msvccompras.services;

import com.ignacio.msvccompras.models.Compra;

import java.util.List;

public interface CompraService {
    List<Compra> findAll();
    List<Compra> findById(Long id);
    Compra save(Compra compra);
    void deleteById(Long id);

    Object deletedById(Long id);
}
