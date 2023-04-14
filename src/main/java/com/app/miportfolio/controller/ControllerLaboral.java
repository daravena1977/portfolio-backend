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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/laborales")
public class ControllerLaboral {
    
    @Autowired
    
    private ILaboralService laborServ;
    
    @PostMapping ("/new")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void crearLaborales (@RequestBody Laboral labor){
        laborServ.crearLaboral(labor);
    }
    
    @GetMapping ("/lista-laborales")
    @ResponseBody
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Laboral> verLaborales(){
        return laborServ.verLaborales();
    }
    
    @DeleteMapping ("/delete/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void borrarLaborales(@PathVariable Long id){
        laborServ.borrarLaboral(id);
    }
    
    @GetMapping ("/buscar/{id}")
    @ResponseBody
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Laboral buscarLaborales (@PathVariable Long id){
        return laborServ.burcasLaboral(id);
    }
    
    @PutMapping ("/editar")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void editarLaborales(@RequestBody Laboral labor){
        laborServ.editarLaboral(labor);
    }
    
    
    
    
    
}
