package com.example.pizzeria.repositories;

import com.example.pizzeria.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingsRepositories extends JpaRepository<Topping, Long> {
}
