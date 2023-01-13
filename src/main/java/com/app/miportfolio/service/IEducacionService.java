package com.app.miportfolio.service;

import com.app.miportfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion educ);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
    public void editarEducacion(Educacion educ);   
    
    
}
