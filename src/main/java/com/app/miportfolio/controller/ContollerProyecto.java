package com.app.miportfolio.controller;

import com.app.miportfolio.model.Proyecto;
import com.app.miportfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/proyectos")
public class ContollerProyecto {
    
    @Autowired
    private IProyectoService proyecServ;
    
    @GetMapping ("/lista-proyectos")
    @ResponseBody
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Proyecto> verProyectos(){
        return proyecServ.verProyectos();
    }
    
    @PostMapping ("/new")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void crearProyecto(@RequestBody Proyecto proyec){
        proyecServ.crearProyecto(proyec);
    }
    
    @DeleteMapping ("/borrar/{id}") 
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarProyecto(@PathVariable Long id){
        proyecServ.borrarProyecto(id);
    }
    
    @GetMapping ("/buscar/{id}")
    @ResponseBody
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Proyecto buscarProyecto (@PathVariable Long id){
        return proyecServ.buscarProyecto(id);
    }
    
    @PutMapping ("/editar")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void editarProyecto(@RequestBody Proyecto proyec){
        proyecServ.editarProyecto(proyec);
    }
    
    
    
}
