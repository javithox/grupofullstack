package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.EstadisticasService;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/estadisticas")
public class gestorDatos {

    @Autowired
    private EstadisticasService service;

    @GetMapping("/usuarios")
    public Map<String, Object> estadisticasUsuarios() {
        return service.obtenerEstadisticasUsuarios();
    }

    @GetMapping("/envios")
    public Map<String, Object> estadisticasEnvios() {
        return service.obtenerEstadisticasEnvios();
    }

    @GetMapping("/general")
    public Map<String, Object> reporteGeneral() {
        return service.obtenerReporteGeneral();
    }
}
