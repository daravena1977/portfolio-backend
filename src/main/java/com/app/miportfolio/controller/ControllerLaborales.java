package com.app.miportfolio.controller;

import com.app.miportfolio.model.Laborales;
import com.app.miportfolio.service.ILaboralesService;
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
public class ControllerLaborales {
    
    @Autowired
    
    private ILaboralesService laborServ;
    
    @PostMapping ("/new/laborales")
    public void crearLaborales (@RequestBody Laborales labor){
        laborServ.crearLaborales(labor);
    }
    
    @GetMapping ("/ver/laborales")
    @ResponseBody
    public List<Laborales> verLaborales(){
        return laborServ.verLaborales();
    }
    
    @DeleteMapping ("/delete/laborales/{id}")
    public void borrarLaborales(@PathVariable Long id){
        laborServ.borrarLaborales(id);
    }
    
    @GetMapping ("/buscar/laborales/{id}")
    @ResponseBody
    public Laborales buscarLaborales (@PathVariable Long id){
        return laborServ.burcasLaborales(id);
    }
    
    @PutMapping ("/editar/laborales")
    public void editarLaborales(@RequestBody Laborales labor){
        laborServ.editarLaborales(labor);
    }
    
    
    
    
    
}
