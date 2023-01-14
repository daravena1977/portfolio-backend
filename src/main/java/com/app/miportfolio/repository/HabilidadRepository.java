package com.app.miportfolio.repository;

import com.app.miportfolio.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository <Habilidad, Long> {
    
}


