package models;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId; // Comprador
    private Double total;
    private String metodoPago;
    private String estado; // CREADA, PAGADA, CANCELADA

    private LocalDate fecha;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<ventaDetalle> detalles;

}