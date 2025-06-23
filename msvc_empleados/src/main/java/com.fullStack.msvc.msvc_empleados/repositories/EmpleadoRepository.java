
package com.fullStack.msvc.msvc_empleados.repositories;


import com.grupoFullStack.msvc.gestionTienda.models.Empleado;
import com.grupoFullStack.msvc.gestionTienda.models.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findBySucursal(Sucursal sucursal);
}
