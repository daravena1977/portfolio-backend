package com.app.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String logoHabilidad;
    private String nombreHabilidad;
    private int porcentajeHabilidad;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_persona")
    private Persona persona;

    public Habilidad() {
        
    }

    public Habilidad(Long id, String logoHabilidad, String nombreHabilidad, int porcentajeHabilidad) {
        this.id = id;
        this.logoHabilidad = logoHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.porcentajeHabilidad = porcentajeHabilidad;
    }
    
    
    
    
    
}
