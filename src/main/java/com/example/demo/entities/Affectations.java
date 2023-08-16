package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "affectations")

public class Affectations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_affectation")
    @EmbeddedId
    private Affectations_key id;
    @ManyToOne
    @MapsId("demandeId")
    @JoinColumn(name="id_demande")
    private Demande demd;
    @ManyToOne
    @MapsId("enginsId")
    @JoinColumn(name="engins_id")
    private Engins eng;
    private Date date_entree;
    private Date date_sortie;


}

