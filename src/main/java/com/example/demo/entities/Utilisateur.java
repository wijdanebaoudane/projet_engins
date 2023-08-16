package com.example.demo.entities;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role",length = 15,discriminatorType = DiscriminatorType.STRING)
@Table(name = "utilisateurs")
@Data @AllArgsConstructor @NoArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    private String nom_us;
    private String mdp;
    private String email;
    private String token;
    private String roles;

    public void SetName(String name) {
        this.nom_us = name;
    }

    @OneToMany(mappedBy = "utilis", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Demande> demandes;
}

