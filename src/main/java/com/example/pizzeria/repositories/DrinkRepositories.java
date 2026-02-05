package com.example.pizzeria.repositories;

import com.example.pizzeria.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepositories extends JpaRepository<Drink, Long> {
}
