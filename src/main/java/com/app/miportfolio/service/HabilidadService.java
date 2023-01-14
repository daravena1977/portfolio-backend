package com.app.miportfolio.service;

import com.app.miportfolio.model.Habilidad;
import com.app.miportfolio.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{
    
    @Autowired
    public HabilidadRepository habilidadRepository;

    @Override
    public List<Habilidad> verHabilidades() {
        return habilidadRepository.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilidadRepository.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habilidadRepository.findById(id).orElse(null);
    }

    @Override
    public void editarHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }
    
    
}
