package com.example.pizzeria.runners;

import com.example.pizzeria.entities.Drink;
import com.example.pizzeria.services.DrinksService;
import com.example.pizzeria.services.PizzeService;
import com.example.pizzeria.services.ToppingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    @Autowired
    private final PizzeService pizzeService;

    @Autowired
    private final ToppingsService toppingsService;

    @Autowired
    private final DrinksService drinksService;

    public Runner(PizzeService pizzeService, ToppingsService toppingsService, DrinksService drinksService) {
        this.pizzeService = pizzeService;
        this.toppingsService = toppingsService;
        this.drinksService = drinksService;
    }


    @Override
    public void run(String... args) throws Exception {

        //ora che tutto è pronto possimao creare e quindi vedere in tabella le nostre pizze, topping e drink
        


    }
}
