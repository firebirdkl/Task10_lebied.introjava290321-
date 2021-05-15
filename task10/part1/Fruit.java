package com.projects.lebed.introjava290321.task10.part1;

import java.awt.*;

public class Fruit {
    enum Type {
        APPLE, BANANA, LEMON
    }

    private Type type;
    private Color color;
    private int weight;//gram
    private double pricePerKg;

    public Fruit(Type type, Color color, int weight, double pricePerKg) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weight=" + weight +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}