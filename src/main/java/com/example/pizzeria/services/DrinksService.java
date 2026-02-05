package com.example.pizzeria.services;

import com.example.pizzeria.repositories.DrinkRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DrinksService {

    private final DrinkRepositories drinkRepositories;

    @Autowired
    public DrinksService(DrinkRepositories drinkRepositories) {
        this.drinkRepositories = drinkRepositories;
    }
}
