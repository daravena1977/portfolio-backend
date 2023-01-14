package com.app.miportfolio.controller;

import com.app.miportfolio.model.Habilidad;
import com.app.miportfolio.service.IHabilidadService;
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
public class ControllerHabilidad {
    
    @Autowired
    private IHabilidadService habilidadService;
    
    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<Habilidad> verhabilidades(){
        return habilidadService.verHabilidades();
    }
    
    @PostMapping ("/new/habilidad")
    public void agregarHabilidad(@RequestBody Habilidad habilidad){
        habilidadService.crearHabilidad(habilidad);
    }
    
    @DeleteMapping ("/borrar/habilidad/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habilidadService.borrarHabilidad(id);
    }
    
    @GetMapping ("/buscar/habilidad/{id}")
    @ResponseBody
    public void buscarHabilidad(@PathVariable Long id){
        habilidadService.buscarHabilidad(id);
    }
    
    @PutMapping ("/editar/habilidad")
    public void editarHabilidad (@RequestBody Habilidad hablidad){
        habilidadService.editarHabilidad(hablidad);
    }
    
    
    
    
    
}
