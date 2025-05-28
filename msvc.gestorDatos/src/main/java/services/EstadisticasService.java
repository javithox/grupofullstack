package services;


import java.util.Map;

public interface EstadisticasService {
    Map<String, Object> obtenerEstadisticasUsuarios();
    Map<String, Object> obtenerEstadisticasEnvios();
    Map<String, Object> obtenerReporteGeneral();
}

