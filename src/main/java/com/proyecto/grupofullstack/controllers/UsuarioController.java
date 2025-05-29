package com.proyecto.grupofullstack.controllers;

import com.proyecto.grupofullstack.models.Usuario;
import com.proyecto.grupofullstack.services.usuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Usuario/")
@Validated
public class UsuarioController {
    @Autowired
    private usuarioServices usuarioServices;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.usuarioServices.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(this.usuarioServices.findById(id));
    }
    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.usuarioServices.Save(usuario));
    }
}
