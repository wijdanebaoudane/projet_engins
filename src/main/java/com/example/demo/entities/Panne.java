package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name="panne")
public class Panne implements Serializable {

    @EmbeddedId
    private Panne_key id;
    @ManyToOne
    @MapsId("enginsId")
    @JoinColumn(name="engins_id")
    private Engins eng;
    @ManyToOne
    @MapsId("composantId")
    @JoinColumn(name="composant_id")
    private Composants cmp;
    private  Boolean etat;


}
