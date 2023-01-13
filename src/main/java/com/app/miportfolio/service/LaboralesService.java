package com.app.miportfolio.service;

import com.app.miportfolio.model.Laborales;
import com.app.miportfolio.repository.LaboralesRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LaboralesService implements ILaboralesService {

    @Autowired
    public LaboralesRepository laborRepo;
    
    @Override
    public List<Laborales> verLaborales() {
        return laborRepo.findAll();
    }

    @Override
    public void crearLaborales(Laborales labor) {
        laborRepo.save(labor);
        
    }

    @Override
    public void borrarLaborales(Long id) {
        laborRepo.deleteById(id);
    }

    @Override
    public Laborales burcasLaborales(Long id) {
        return laborRepo.findById(id).orElse(null);
    }

    @Override
    public void editarLaborales(Laborales labor) {
        laborRepo.save(labor);
    }
    
}
