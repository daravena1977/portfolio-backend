package com.app.miportfolio.controller;

import com.app.miportfolio.model.Proyecto;
import com.app.miportfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContollerProyecto {
    
    @Autowired
    private IProyectoService proyecServ;
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyecServ.verProyectos();
    }
    
    @PostMapping ("/new/proyecto")
    public void crearProyecto(@RequestBody Proyecto proyec){
        proyecServ.crearProyecto(proyec);
    }
    
    @DeleteMapping ("/borrar/proyecto/{id}") 
    public void borrarProyecto(@PathVariable Long id){
        proyecServ.borrarProyecto(id);
    }
    
    @GetMapping ("/buscar/proyecto/{id}")
    @ResponseBody
    public Proyecto buscarProyecto (@PathVariable Long id){
        return proyecServ.buscarProyecto(id);
    }
    
    @PutMapping ("/editar/proyecto/")
    public void editarProyecto(@RequestBody Proyecto proyec){
        proyecServ.editarProyecto(proyec);
    }
    
    
    
}
