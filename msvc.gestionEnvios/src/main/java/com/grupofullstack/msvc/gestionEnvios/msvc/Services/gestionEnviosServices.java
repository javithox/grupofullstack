package com.grupofullstack.msvc.gestionEnvios.msvc.Services;

import com.grupofullstack.msvc.gestionEnvios.msvc.Models.entities.Envios;

import java.util.List;

public interface gestionEnviosServices {
    List<Envios> listarEnvios();
    Envios crearEnvio(Envios envios);
    Envios obtenerEnvio(Long id);
    Envios actualizarEstado(Long id, String estado);
    void eliminarEnvio(Long id);
}
