package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Table(name = "engins")
@Data @AllArgsConstructor @NoArgsConstructor

public class Engins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_engins")
    private Long id_engins;
    private Boolean panne;
    private Boolean disponible;
    @OneToMany(mappedBy = "eng",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Affectations> enginslist;
    @OneToMany(mappedBy = "eng",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Panne> panneList;

}
