package com.app.miportfolio.service;

import com.app.miportfolio.model.Educacion;
import com.app.miportfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository educRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return educRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion educ) {
        educRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Long id) {
        educRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducacion(Educacion educ) {
        educRepo.save(educ);
    }
    
}
