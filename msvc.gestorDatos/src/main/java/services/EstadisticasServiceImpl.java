package services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RegistroAccesoRepository;

import java.util.Map;

@Service
public class EstadisticasServiceImpl implements EstadisticasService {

    @Autowired
    private RegistroAccesoRepository RegistroAccesoRepository;

    public EstadisticasServiceImpl(RegistroAccesoRepository registroAccesoRepository) {
        RegistroAccesoRepository = registroAccesoRepository;
    }

    public Map<String, Object> obtenerEstadisticasUsuarios() {
        return Map.of("totalUsuarios", 124, "activos", 97);
    }

    public Map<String, Object> obtenerEstadisticasEnvios() {
        return Map.of("totalEnvios", 542, "entregados", 491);
    }

    public Map<String, Object> obtenerReporteGeneral() {
        return Map.of(
                "usuarios", obtenerEstadisticasUsuarios(),
                "envios", obtenerEstadisticasEnvios()
        );
    }
}

