package com.grupofullstack.msvc.gestionEnvios.msvc.Services;

import com.grupofullstack.msvc.gestionEnvios.msvc.Models.entities.Envios;


import com.grupofullstack.msvc.gestionEnvios.msvc.Repository.gestionEnviosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gestionEnviosServicesImpl implements gestionEnviosServices {

    @Autowired
    private gestionEnviosRepository gestionEnviosRepository;

    public List<Envios> listarEnvios() { return gestionEnviosRepository.findAll(); }
    public Envios crearEnvio(Envios envios) { return gestionEnviosRepository.save(envios); }
    public Envios obtenerEnvio(Long id) { return gestionEnviosRepository.findById(id).orElse(null); }
    public Envios actualizarEstado(Long id, String estado) {
        Envios envios = obtenerEnvio(id);
        if (envios != null) {
            envios.setEstado(estado);
            return gestionEnviosRepository.save(envios);
        }
        return null;
    }
    public void eliminarEnvio(Long id) { gestionEnviosRepository.deleteById(id); }
}

