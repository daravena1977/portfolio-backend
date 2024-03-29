package com.app.miportfolio.service;

import com.app.miportfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    public void editarPersona (Persona per);
    
    
}
