package com.fullStack.msvc.msvc_empleados.services.impl;


import com.fullStack.msvc.msvc_empleados.models.Empleado;
import com.fullStack.msvc.msvc_empleados.repositories.EmpleadoRepository;
import com.fullStack.msvc.msvc_empleados.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository repository;

    @Override
    public List<Empleado> findAll() {
       return this.repository.findAll();
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Empleado save(Empleado empleado) {
        return repository.save(empleado);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
