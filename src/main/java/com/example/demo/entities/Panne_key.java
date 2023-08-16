package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable

public class Panne_key implements Serializable {
    @Column(name="composant_id")
    private  Integer composantId;
    @Column(name="engins_id")
    private  Integer enginsId;
}
