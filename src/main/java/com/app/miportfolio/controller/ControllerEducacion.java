package com.app.miportfolio.controller;

import com.app.miportfolio.model.Educacion;
import com.app.miportfolio.service.IEducacionService;
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
@RequestMapping("/api/educacion")
public class ControllerEducacion {
    
    @Autowired
    
    private IEducacionService educServ;
    
    @GetMapping ("/lista-educacion")
    @ResponseBody
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Educacion> verEducacion(){
        return educServ.verEducacion();
    }
    
    @PostMapping ("/new")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void agregarEducacion(@RequestBody Educacion educ){
        educServ.crearEducacion(educ);
    }
    
    @DeleteMapping ("/delete/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarEducacion (@PathVariable Long id){
        educServ.borrarEducacion(id);
    }
    
    @GetMapping ("/buscar/{id}")
    @ResponseBody
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Educacion buscarEducacion (@PathVariable Long id){
        return educServ.buscarEducacion(id);
    }
    
    @PutMapping ("/editar")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void editarEducacion (@RequestBody Educacion educ){
        educServ.editarEducacion(educ);
    }
    
    
    
}
