package com.app.miportfolio.controller;

import com.app.miportfolio.model.Laborales;
import com.app.miportfolio.service.ILaboralesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLaborales {
    
    @Autowired
    
    private ILaboralesService laborServ;
    
    @PostMapping ("/new/laborales")
    public void crearLaborales (@RequestBody Laborales labor){
        laborServ.crearLaborales(labor);
    }
    
    
}
