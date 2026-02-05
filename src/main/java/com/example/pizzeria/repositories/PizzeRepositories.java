package com.example.pizzeria.repositories;

import com.example.pizzeria.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeRepositories extends JpaRepository<Pizza, Long> {
}
