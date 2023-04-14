package com.app.miportfolio.controller;

import com.app.miportfolio.model.Habilidad;
import com.app.miportfolio.service.IHabilidadService;
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
@RequestMapping("/api/habilidades")
public class ControllerHabilidad {
    
    @Autowired
    private IHabilidadService habilidadService;
    
    @GetMapping ("/lista-habilidades")
    @ResponseBody
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Habilidad> verhabilidades(){
        return habilidadService.verHabilidades();
    }
    
    @PostMapping ("/new")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarHabilidad(@RequestBody Habilidad habilidad){
        habilidadService.crearHabilidad(habilidad);
    }
    
    @DeleteMapping ("/borrar/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarHabilidad(@PathVariable Long id){
        habilidadService.borrarHabilidad(id);
    }
    
    @GetMapping ("/buscar/{id}")
    @ResponseBody
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void buscarHabilidad(@PathVariable Long id){
        habilidadService.buscarHabilidad(id);
    }
    
    @PutMapping ("/editar")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void editarHabilidad (@RequestBody Habilidad hablidad){
        habilidadService.editarHabilidad(hablidad);
    }
    
    
    
    
    
}
