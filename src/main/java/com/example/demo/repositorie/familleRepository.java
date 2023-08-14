package com.example.demo.repositorie;

import com.example.demo.entities.famille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface familleRepository extends JpaRepository<famille,Long> {
}
