package com.app.miportfolio.service;

import com.app.miportfolio.model.Laborales;
import java.util.List;

public interface ILaboralesService {
    
    public List<Laborales> verLaborales();
    public void crearLaborales(Laborales labor);
    public void borrarLaborales(Long id);
    public Laborales burcasLaborales(Long id);
    public void editarLaborales (Laborales labor);
    
    
    
}
