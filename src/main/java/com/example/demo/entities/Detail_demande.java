package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
@Entity
@Table(name="Detail_commande")

public class Detail_demande implements Serializable {
    @EmbeddedId
    private Detail_demande_key id;
    @ManyToOne
    @MapsId("demandeId")
    @JoinColumn(name="id_demande")
    private Demande demd;
    @ManyToOne
    @MapsId("familleId")
    @JoinColumn(name="id_famille")
    private Famille fml;
    private  double quantite;


}
