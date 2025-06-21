package com.grupoFullStack.msvc.gestionTienda.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="msvc-producto",url="localhost:8080/api/v1/tiendas/productos")
public interface ProductoClientRest {
}
