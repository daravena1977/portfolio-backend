package com.app.miportfolio.controller;

import com.app.miportfolio.model.Laboral;
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
import com.app.miportfolio.service.ILaboralService;

@RestController
public class ControllerLaboral {
    
    @Autowired
    
    private ILaboralService laborServ;
    
    @PostMapping ("/new/laborales")
    public void crearLaborales (@RequestBody Laboral labor){
        laborServ.crearLaboral(labor);
    }
    
    @GetMapping ("/ver/laborales")
    @ResponseBody
    public List<Laboral> verLaborales(){
        return laborServ.verLaborales();
    }
    
    @DeleteMapping ("/delete/laborales/{id}")
    public void borrarLaborales(@PathVariable Long id){
        laborServ.borrarLaboral(id);
    }
    
    @GetMapping ("/buscar/laborales/{id}")
    @ResponseBody
    public Laboral buscarLaborales (@PathVariable Long id){
        return laborServ.burcasLaboral(id);
    }
    
    @PutMapping ("/editar/laborales")
    public void editarLaborales(@RequestBody Laboral labor){
        laborServ.editarLaboral(labor);
    }
    
    
    
    
    
}
