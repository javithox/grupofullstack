package Controller;

import Services.envioService;
import models.Envio;

import java.util.List;

@RestController
@RequestMapping("/api/envios")
public class gestionEnvioController {

    @Autowired
    private envioService EnvioService;

    @PostMapping
    public Envio crearEnvio(@RequestBody Envio envio) {
        return envioService.crearEnvio(envio);
    }

    @GetMapping
    public List<Envio> listar() {
        return envioService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Envio> porId(@PathVariable Long id) {
        return envioService.porId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
