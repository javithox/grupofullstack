package com.grupoFullStack.msvc.gestionTienda.clients;

import com.grupofullstack.msvc.gestionEnvios.msvc.Models.Empleado;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "msvc_empleados",url = "localhost:8080/api/v1/empleados")
public interface EmpleadoClientRest {
    @GetMapping
    List<Empleado> listar();

    @GetMapping("/{id}")
    Empleado detalle(@PathVariable Long id);

    @GetMapping("/sucursal/{nombre}")
     List<Empleado> listarPorSucursal(@PathVariable String nombre);

    @PostMapping
    Empleado crear(@Valid @RequestBody Empleado empleado);

    @PutMapping("/{id}/permisos")
    Empleado actualizarPermiso(@PathVariable Long id, @RequestBody String permiso);
    @DeleteMapping("/{id}")
    Void eliminar(@PathVariable Long id);
}
