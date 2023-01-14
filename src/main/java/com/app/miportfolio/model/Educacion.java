package com.app.miportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String logoInstitucion;
    private String nombreInstitucion;
    private String nombreCurso;
    private String estadoCurso;
    
    @Temporal(TemporalType.DATE)
    private Date fechaDesde;
    private Date fechaHasta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_persona")
    private Persona persona;
    
    
    public Educacion (){
        
    }

    public Educacion(Long id, String logoInstitucion, String nombreInstitucion, String nombreCurso, String estadoCurso, Date fechaDesde, Date fechaHasta) {
        this.id = id;
        this.logoInstitucion = logoInstitucion;
        this.nombreInstitucion = nombreInstitucion;
        this.nombreCurso = nombreCurso;
        this.estadoCurso = estadoCurso;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }
    
    
    
    
    
}
