package com.app.miportfolio.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
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
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Laborales> listaLaborales;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Educacion> listaEducacion;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Habilidad> listaHabilidades;
    
    public Persona(){
        
    }

    public Persona(Long id, String nombre, String apellido, String acercaDeMi, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acercaDeMi = acercaDeMi;
        this.cargo = cargo;
        
    }
    
    
    
}