package com.example.demo.entities;
import java.io.Serializable;
import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role",length = 15,discriminatorType = DiscriminatorType.STRING)
@Table(name = "utilisateurs")
@Data @AllArgsConstructor @NoArgsConstructor
public class utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    private String nom_us;
    private String mdp;
    private String email;
    private String token;

    public void SetName(String name) {
        this.nom_us = name;
    }
}
