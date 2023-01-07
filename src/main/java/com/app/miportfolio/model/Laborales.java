package com.app.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Laborales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String logo;
    private String nombreEmpresa;
    private String cargo;
    private String funciones;
    private Date fechaDesde;
    private Date fechaHasta;
    
    public Laborales (){
        
        
    }

    public Laborales(Long id, String logo, String nombreEmpresa, String cargo, String funciones, Date fechaDesde, Date fechaHasta) {
        this.id = id;
        this.logo = logo;
        this.nombreEmpresa = nombreEmpresa;
        this.cargo = cargo;
        this.funciones = funciones;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }
    
    
    
}
