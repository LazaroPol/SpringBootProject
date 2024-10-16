package com.pablomonteserin.prueba.persistence.repository;

import com.pablomonteserin.prueba.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

   public interface PersonaRepository extends JpaRepository<Persona, Integer> {
        @Query("SELECT p FROM Persona p WHERE p.id=:id")
        Persona findPerson(@Param("id")int id);

        List<Persona> findAll();

        @Transactional
        void deleteByNombre(String nombre);
    }


