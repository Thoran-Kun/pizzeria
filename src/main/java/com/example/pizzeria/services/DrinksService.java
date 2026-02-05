package com.example.pizzeria.services;

import com.example.pizzeria.entities.Drink;
import com.example.pizzeria.entities.Pizza;
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

    public void saveDrink(Drink newDrink){
        this.drinkRepositories.save(newDrink);
        log.info("il drink " + newDrink.getName() + " è stato salvato correttamente");
    }
}
