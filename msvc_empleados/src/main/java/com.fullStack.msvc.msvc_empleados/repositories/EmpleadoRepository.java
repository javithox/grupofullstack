
package com.ignacio.msvc_empleados.repositories;

import com.ignacio.msvc_empleados.models.Empleado;
import com.ignacio.msvc_empleados.models.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findBySucursal(Sucursal sucursal);
}
