
package com.ignacio.msvc_empleados.controllers;

import com.ignacio.msvc_empleados.models.Empleado;
import com.ignacio.msvc_empleados.models.Sucursal;
import com.ignacio.msvc_empleados.services.EmpleadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService service;

    @GetMapping
    public List<Empleado> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> detalle(@PathVariable Long id) {
        Optional<Empleado> empleado = service.findById(id);
        return empleado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/sucursal/{nombre}")
    public List<Empleado> listarPorSucursal(@PathVariable String nombre) {
        return service.findBySucursal(Sucursal.valueOf(nombre.toUpperCase()));
    }

    @PostMapping
    public ResponseEntity<Empleado> crear(@Valid @RequestBody Empleado empleado) {
        return ResponseEntity.ok(service.save(empleado));
    }

    @PutMapping("/{id}/permisos")
    public ResponseEntity<Empleado> actualizarPermiso(@PathVariable Long id, @RequestBody String permiso) {
        Optional<Empleado> optionalEmpleado = service.findById(id);
        if (optionalEmpleado.isPresent()) {
            Empleado empleado = optionalEmpleado.get();
            empleado.setPermiso(permiso);
            return ResponseEntity.ok(service.save(empleado));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
