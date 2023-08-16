package com.example.demo.repositorie;

import com.example.demo.entities.Engins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnginsRepository extends JpaRepository<Engins,Long>{
}
