package models;

@Entity
@Table(name = "venta_detalle")
public class ventaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productoId;
    private Integer cantidad;
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "venta_id")
    private Venta venta;
}
