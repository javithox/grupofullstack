package controller;

import Services.ventaService;
import models.Venta;


import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class gestionVentaCotroller {

    @Autowired
    private ventaService VentaService;

    @PostMapping
    public Venta crearVenta(Venta venta) {
        return ventaService.crearVenta(venta);
    }

    @GetMapping
    public List<Venta> listar() {
        return ventaService.listarVentas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> porId(@PathVariable Long id) {
        return ventaService.porId(Long)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
