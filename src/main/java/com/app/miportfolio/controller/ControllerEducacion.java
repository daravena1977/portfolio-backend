package com.app.miportfolio.controller;

import com.app.miportfolio.model.Educacion;
import com.app.miportfolio.service.IEducacionService;
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
public class ControllerEducacion {
    
    @Autowired
    
    private IEducacionService educServ;
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educServ.verEducacion();
    }
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion educ){
        educServ.crearEducacion(educ);
    }
    
    @DeleteMapping ("/delete/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
        educServ.borrarEducacion(id);
    }
    
    @GetMapping ("/buscar/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacion (@PathVariable Long id){
        return educServ.buscarEducacion(id);
    }
    
    @PutMapping ("/editar/educacion")
    public void editarEducacion (@RequestBody Educacion educ){
        educServ.editarEducacion(educ);
    }
    
    
    
}
