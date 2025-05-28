package com.ignacio.msvc_empleados.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PermisoClientService {

    @Autowired
    private WebClient webClient;

    public String obtenerPermisoPorEmpleadoId(Long empleadoId) {
        return webClient.get()
                .uri("http://localhost:8083/api/permisos/empleado/{id}", empleadoId)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
