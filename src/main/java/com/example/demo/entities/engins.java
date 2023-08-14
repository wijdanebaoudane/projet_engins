package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "engins")
@Data @AllArgsConstructor @NoArgsConstructor

public class engins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_engins")
    private Long id_engins;
    private Boolean panne;
    private Boolean disponible;

}
