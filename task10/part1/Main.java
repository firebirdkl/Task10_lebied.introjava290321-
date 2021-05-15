package com.projects.lebed.introjava290321.task10.part1;

import java.awt.*;//Abstract Window Toolkit работа с цветами, шрифтами, отрисовка графических примитивов и т.д.

public class Main {
    public static void main(String[] args) {
        ShopAssistant shopAssistant = new ShopAssistant();
        shopAssistant.addFruit(new Fruit(Fruit.Type.APPLE, Color.GREEN, 346, 21.95));
        shopAssistant.addFruit(new Fruit(Fruit.Type.APPLE, Color.RED, 230, 19.95));
        shopAssistant.addFruit(new Fruit(Fruit.Type.BANANA, Color.YELLOW, 220, 32.85));
        shopAssistant.addFruit(new Fruit(Fruit.Type.LEMON, Color.YELLOW, 88, 34.95));
        
        double total = shopAssistant.calculateReceipt();
        
        System.out.printf("Total Sum: %.2f UAH", total);//Output: Total Sum: 22,49 UAH
    }
}