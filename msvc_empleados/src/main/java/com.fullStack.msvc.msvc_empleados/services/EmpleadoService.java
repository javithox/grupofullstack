
package com.fullStack.msvc.msvc_empleados.services;


import com.fullStack.msvc.msvc_empleados.models.Empleado;


import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    List<Empleado> findAll();
    Optional<Empleado> findById(Long id);
    void deleteById(Long id);
    Empleado save(Empleado empleado);
}
