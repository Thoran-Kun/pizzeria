package com.example.pizzeria.runners;

import com.example.pizzeria.entities.Drink;
import com.example.pizzeria.entities.Pizza;
import com.example.pizzeria.entities.Topping;
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
        Topping t1 = new Topping("Pomodoro", 0.50, 20);
        Topping t2 = new Topping("Mozzarella", 1.00, 150);
        Topping t3 = new Topping("Salame", 1.50, 200);

        toppingsService.saveTopping(t1);
        toppingsService.saveTopping(t2);
        toppingsService.saveTopping(t3);

        Pizza margherita = new Pizza("Margherita", 5.00, 800);
        Pizza diavola = new Pizza("Diavola", 7.00, 1100);

        margherita.getToppings().add(t1);
        margherita.getToppings().add(t2);

        diavola.getToppings().add(t1);
        diavola.getToppings().add(t2);
        diavola.getToppings().add(t3);

        pizzeService.savePizza(margherita);
        pizzeService.savePizza(diavola);

        Drink cocaCola = new Drink("Coca Cola", 1.70, 200);
        Drink acqua = new Drink("acqua", 1.00, 0);
        Drink birra = new Drink("birra", 2.50, 250);

        drinksService.saveDrink(cocaCola);
        drinksService.saveDrink(acqua);
        drinksService.saveDrink(birra);

        log.info("DATI INVIATI AL DB! :)");
    }
}
