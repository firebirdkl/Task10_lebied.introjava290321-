package com.projects.lebed.introjava290321.task10.part1;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {
    private List<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public double calculateReceipt() {
        double total = 0;
        for (Fruit fruit : fruits) {
            total += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }
        return total;
    }
}