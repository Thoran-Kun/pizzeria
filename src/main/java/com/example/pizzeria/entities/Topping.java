package com.example.pizzeria.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="toppings")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "pizze")
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private int calories;

    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizze = new ArrayList<>();

    public Topping(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}