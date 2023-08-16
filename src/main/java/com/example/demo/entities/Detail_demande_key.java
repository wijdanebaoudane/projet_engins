package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable

public class Detail_demande_key  implements Serializable {
    @Column(name="demande_id")
    private  Integer demandeId;
    @Column(name="famille_id")
    private  Integer familleId;



}
