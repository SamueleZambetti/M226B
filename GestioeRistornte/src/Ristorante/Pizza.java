package Ristorante;

import java.util.ArrayList;

public class Pizza implements MenuItem {
    private String name;
    private double basePrice;
    private ArrayList<String> toppings;

    public Pizza(String name, double basePrice, ArrayList<String> toppings) {
        this.name = name;
        this.basePrice = basePrice;
        this.toppings = toppings;
    }

    @Override
    public double calculatePrice() {
        return basePrice + 0.5 * toppings.size();
    }

    @Override
    public String getDescription() {
        return "Pizza " + name + " con: " + String.join(", ", toppings);
    }

    @Override
    public int getPreparationTime() {
        return 10 + toppings.size() * 3;
    }

    public String getName() {
        return name;
    }
}
