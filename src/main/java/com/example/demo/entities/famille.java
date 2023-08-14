package com.example.demo.entities;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;



@Entity
@Table(name = "famille")
@Data @AllArgsConstructor @NoArgsConstructor
public class famille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_famille")
    private Long id_famille;
    private Long nom_famille;
}
