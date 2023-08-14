package com.example.demo.entities;


import java.util.Date;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor

@Entity
@Table(name = "demande")
public class demande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_demande")
    private Long id_demande;
    private Date date_sortie;
    private Integer shift;
    private  Boolean confirmation;


}
