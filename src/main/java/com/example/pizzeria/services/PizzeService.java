package com.example.pizzeria.services;

import com.example.pizzeria.entities.Pizza;
import com.example.pizzeria.repositories.PizzeRepositories;
import com.example.pizzeria.repositories.ToppingsRepositories;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PizzeService {

    private final PizzeRepositories pizzeRepositories;
    private final ToppingsRepositories toppingsRepositories;

    @Autowired
    public PizzeService(PizzeRepositories pizzeRepositories, ToppingsRepositories toppingsRepositories) {
        this.pizzeRepositories = pizzeRepositories;
        this.toppingsRepositories = toppingsRepositories;
    }

    @Transactional
    public void savePizza(Pizza newPizza){
        this.pizzeRepositories.save(newPizza);
        log.info("la pizza " + newPizza.getName() + " è stata salvata correttamente");
    }
}
