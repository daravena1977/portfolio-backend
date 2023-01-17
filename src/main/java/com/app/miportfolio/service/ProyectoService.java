package com.app.miportfolio.service;

import com.app.miportfolio.model.Proyecto;
import com.app.miportfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyecRepo;
    
    @Override
    public List<Proyecto> verProyectos() {
        return proyecRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyecRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyecRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyecRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyecto(Proyecto proyecto) {
        proyecRepo.save(proyecto);
    }
    
}
