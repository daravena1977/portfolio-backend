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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Laborales burcasLaborales(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarLaborales(Laborales labor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
