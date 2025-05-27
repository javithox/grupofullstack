package com.ignacio.msvcpagos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Nombre del servicio debe coincidir con el registro en Eureka o nombre DNS si usás,
// si no, poner localhost y puerto explícito.
@FeignClient(name = "msvc-compras", url = "http://localhost:8081")
public interface CompraClient {

    @GetMapping("/api/compras/{id}")
    CompraResponse getCompraById(@PathVariable("id") Long id);

    // Clase interna para mapear la respuesta JSON del microservicio compras
    class CompraResponse {
        public Long id;
        public Long usuarioId;
        public Double total;
        public Boolean pagado;
        // agregá otros campos si necesitás
    }
}
