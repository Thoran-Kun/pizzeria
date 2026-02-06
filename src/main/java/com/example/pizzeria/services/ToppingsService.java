package com.example.pizzeria.services;

import com.example.pizzeria.entities.Pizza;
import com.example.pizzeria.entities.Topping;
import com.example.pizzeria.repositories.ToppingsRepositories;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ToppingsService {

    private final ToppingsRepositories toppingsRepositories;

    @Autowired
    public ToppingsService(ToppingsRepositories toppingsRepositories) {
        this.toppingsRepositories = toppingsRepositories;
    }

    @Transactional
    public void saveTopping(Topping topping) {
        if (topping.getName() == null) {
            throw new RuntimeException("Il nome del topping è nullo nel Service!");
        }
        this.toppingsRepositories.save(topping);
    }
}
