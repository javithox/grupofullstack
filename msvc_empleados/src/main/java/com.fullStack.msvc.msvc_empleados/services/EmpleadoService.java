
package com.fullStack.msvc.msvc_empleados.services;


import com.grupoFullStack.msvc.gestionTienda.models.Empleado;
import com.grupoFullStack.msvc.gestionTienda.models.Sucursal;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    List<Empleado> findAll();
    Optional<Empleado> findById(Long id);
    List<Empleado> findBySucursal(Sucursal sucursal);
    Empleado save(Empleado empleado);
    void deleteById(Long id);
}
