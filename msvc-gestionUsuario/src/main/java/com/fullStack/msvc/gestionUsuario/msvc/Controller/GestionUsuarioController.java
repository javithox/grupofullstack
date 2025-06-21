package com.fullStack.msvc.gestionUsuario.msvc.Controller;

import com.fullStack.msvc.gestionUsuario.msvc.Repository.gestionUsuarioRepository;
import com.fullStack.msvc.gestionUsuario.msvc.models.GestionUsuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/gestionUsuarios")
@Validated
public class GestionUsuarioController {
    @Autowired
    private gestionUsuarioRepository gestionUsuarioRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<GestionUsuario>> FindById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(this.gestionUsuarioRepository.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<GestionUsuario>> FindByName(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body(this.gestionUsuarioRepository.FindByname(name));
    }
    @PostMapping
    public ResponseEntity<GestionUsuario> save(@RequestBody @Valid GestionUsuario gestionUsuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.gestionUsuarioRepository.save(gestionUsuario));

    }
}
