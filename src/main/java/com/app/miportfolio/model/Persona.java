package com.app.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String acercaDeMi;
    private String cargo;
    
    public Persona(){
        
    }
    
    public Persona(Long id, String nombre, String apellido, String acercaDeMi){
        
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acercaDeMi = acercaDeMi;
        
    }
    
}