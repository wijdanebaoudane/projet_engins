package com.example.demo.entities;

import java.util.Date;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "affectations")

public class affectations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_affectation")
    private Long idAffectation;
    private Date date_entree;
    private Date date_sortie;

}

