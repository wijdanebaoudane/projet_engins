package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable

public class Affectations_key implements Serializable {
    @Column(name="demande_id")
    private  Integer demandeId;
    @Column(name="engins_id")
    private  Integer enginsId;

}
