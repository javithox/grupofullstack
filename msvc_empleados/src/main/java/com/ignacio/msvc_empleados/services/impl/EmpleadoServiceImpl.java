package com.ignacio.msvc_empleados.services;

import com.ignacio.msvc_empleados.models.Empleado;
import com.ignacio.msvc_empleados.models.Sucursal;
import com.ignacio.msvc_empleados.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository repository;

    @Autowired
    private PermisoClientService permisoClient;

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = repository.findAll();

        empleados.forEach(empleado -> {
            String permiso = permisoClient.obtenerPermisoPorEmpleadoId(empleado.getId());
            empleado.setPermiso(permiso);
        });

        return empleados;
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        Optional<Empleado> empleado = repository.findById(id);
        empleado.ifPresent(emp -> {
            String permiso = permisoClient.obtenerPermisoPorEmpleadoId(emp.getId());
            emp.setPermiso(permiso);
        });
        return empleado;
    }

    @Override
    public List<Empleado> findBySucursal(Sucursal sucursal) {
        List<Empleado> empleados = repository.findBySucursal(sucursal);
        empleados.forEach(emp -> {
            String permiso = permisoClient.obtenerPermisoPorEmpleadoId(emp.getId());
            emp.setPermiso(permiso);
        });
        return empleados;
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
