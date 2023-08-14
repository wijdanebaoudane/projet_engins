package com.example.demo.entities;
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "composants")
public class composants{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_composant")
    private Long idComposant;
    private  String nom_composant;
}
