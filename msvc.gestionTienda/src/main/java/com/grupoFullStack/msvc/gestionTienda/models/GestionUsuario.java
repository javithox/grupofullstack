package com.grupoFullStack.msvc.gestionTienda.models;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "gestion usuario")
@Entity
@Getter @Setter  @AllArgsConstructor @NoArgsConstructor
@ToString
public class GestionUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "Nombre usuario")
    private String nombre;
    @Column(name = "apellido usuario")
    private String apellido;
    private String roles;

}
