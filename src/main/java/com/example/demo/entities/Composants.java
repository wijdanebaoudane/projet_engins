package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "composants")
public class Composants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_composant")
    private Long idComposant;
    private  String nom_composant;
    @OneToMany(mappedBy = "cmp",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Panne> composantlist;
}
