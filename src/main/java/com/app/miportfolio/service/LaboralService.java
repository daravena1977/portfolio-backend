package com.app.miportfolio.service;

import com.app.miportfolio.model.Laboral;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.miportfolio.repository.LaboralRepository;


@Service
public class LaboralService implements ILaboralService {

    @Autowired
    public LaboralRepository laborRepo;
    
    @Override
    public List<Laboral> verLaborales() {
        return laborRepo.findAll();
    }

    @Override
    public void crearLaboral(Laboral labor) {
        laborRepo.save(labor);
        
    }

    @Override
    public void borrarLaboral(Long id) {
        laborRepo.deleteById(id);
    }

    @Override
    public Laboral burcasLaboral(Long id) {
        return laborRepo.findById(id).orElse(null);
    }

    @Override
    public void editarLaboral(Laboral labor) {
        laborRepo.save(labor);
    }
    
}
