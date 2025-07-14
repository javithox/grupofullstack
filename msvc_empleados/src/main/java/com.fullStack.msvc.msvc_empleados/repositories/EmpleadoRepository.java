
package com.fullStack.msvc.msvc_empleados.repositories;



import com.fullStack.msvc.msvc_empleados.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
