package com.example.demo.repositorie;

import com.example.demo.entities.demande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface demandeRepository extends JpaRepository<demande,Long> {
}
