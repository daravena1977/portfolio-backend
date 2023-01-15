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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreProyecto;
    private String descripcionProyecto;
    private String urlProyecto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_persona")
    private Persona persona;

    public Proyecto() {
        
    }

    public Proyecto(Long id, String nombreProyecto, String descripcionProyecto, String urlProyecto, Persona persona) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.urlProyecto = urlProyecto;
        this.persona = persona;
    }
    
    
    
    
            
    
}
