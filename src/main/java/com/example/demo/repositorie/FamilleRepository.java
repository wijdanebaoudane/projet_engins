package com.example.demo.repositorie;

import com.example.demo.entities.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FamilleRepository extends JpaRepository<Famille,Long> {
}
