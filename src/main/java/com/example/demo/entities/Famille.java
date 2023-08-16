package com.example.demo.entities;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "famille")
@Data @AllArgsConstructor @NoArgsConstructor
public class Famille implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_famille")
    private Long id_famille;
    private Long nom_famille;
    @OneToMany(mappedBy = "fml",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Detail_demande> demandeList;
}
