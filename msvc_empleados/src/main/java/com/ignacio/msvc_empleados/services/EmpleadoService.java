
package com.ignacio.msvc_empleados.services;

import com.ignacio.msvc_empleados.models.Empleado;
import com.ignacio.msvc_empleados.models.Sucursal;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    List<Empleado> findAll();
    Optional<Empleado> findById(Long id);
    List<Empleado> findBySucursal(Sucursal sucursal);
    Empleado save(Empleado empleado);
    void deleteById(Long id);
}
