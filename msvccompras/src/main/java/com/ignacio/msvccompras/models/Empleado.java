
package com.ignacio.msvccompras.models;

import com.grupoFullStack.msvc.gestionTienda.models.Sucursal;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @Enumerated(EnumType.STRING)
    private Sucursal sucursal;

    private String cargo;

    private String permiso;
}
