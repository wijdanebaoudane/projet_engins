package com.example.demo.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor

@Entity
@Table(name = "demande")
public class Demande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_demande")
    private Long id_demande;
    private Date date_sortie;
    private Integer shift;
    private  Boolean confirmation;
    @ManyToOne()
    private Utilisateur utilis;
    @OneToMany(mappedBy = "demd",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Detail_demande> demandeList;
    @OneToMany(mappedBy = "demd",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Affectations> affectationsList;




}
