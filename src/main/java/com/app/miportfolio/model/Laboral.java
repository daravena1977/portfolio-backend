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
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Getter @Setter
@Entity
public class Laboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String logo;
    private String nombreEmpresa;
    private String cargo;
    private String funciones;
    
    @Temporal(TemporalType.DATE)
    private Date fechaDesde;
    private Date fechaHasta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_persona")
    private Persona persona;
    
    public Laboral (){
        
        
    }

    public Laboral(Long id, String logo, String nombreEmpresa, String cargo, String funciones, Date fechaDesde, Date fechaHasta, Persona persona) {
        this.id = id;
        this.logo = logo;
        this.nombreEmpresa = nombreEmpresa;
        this.cargo = cargo;
        this.funciones = funciones;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.persona = persona;
    }

    
    
    public String formatearDesde(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada=sdf.format(fechaDesde);
        return fechaFormateada;
    }
    
    /* public String formatearHasta(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada=sdf.format(fechaHasta);
        return fechaFormateada;
    } */
    
       
    
    
}
