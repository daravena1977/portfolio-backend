package com.app.miportfolio.service;

import com.app.miportfolio.model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    
    public List<Habilidad> verHabilidades();
    public void crearHabilidad(Habilidad habilidad);
    public void borrarHabilidad(Long id);
    public Habilidad buscarHabilidad(Long id);
    public void editarHabilidad(Habilidad habilidad);
    
    
    
}
