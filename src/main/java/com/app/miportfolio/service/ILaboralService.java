package com.app.miportfolio.service;

import com.app.miportfolio.model.Laboral;
import java.util.List;

public interface ILaboralService {
    
    public List<Laboral> verLaborales();
    public void crearLaboral(Laboral labor);
    public void borrarLaboral(Long id);
    public Laboral burcasLaboral(Long id);
    public void editarLaboral (Laboral labor);
    
    
    
}
