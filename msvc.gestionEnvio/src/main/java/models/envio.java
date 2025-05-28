package models;

import java.time.LocalDate;

@Entity
@Table(name = "envios")
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ventaId;
    private String direccion;
    private String estado; // PENDIENTE, ENVIADO, ENTREGADO
    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;


}
