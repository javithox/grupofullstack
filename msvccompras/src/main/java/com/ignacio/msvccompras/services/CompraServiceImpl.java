package com.ignacio.msvccompras.services;

import com.ignacio.msvccompras.models.Compra;
import com.ignacio.msvccompras.repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraRepository repository;

    @Override
    public List<Compra> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Compra> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Compra save(Compra compra) {
        return repository.save(compra);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
