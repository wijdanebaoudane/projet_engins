package com.example.demo.repositorie;

import com.example.demo.entities.Composants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComposantsRepository extends JpaRepository<Composants,Long> {
}
