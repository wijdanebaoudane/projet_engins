package com.example.demo.repositorie;


import com.example.demo.entities.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface utilisateurRepository extends JpaRepository<utilisateur,Long> {
}
