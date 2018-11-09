package com.greenfoxacademy.filip4.Models;

import java.util.ArrayList;


public class Fox {

    String name;
    ArrayList<Trick> listOfTricks;
    String food;
    String drink;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
        this.food = "salad";
        this.drink = "water";
    }

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
    }

    public Fox(String name, String food, String drink, ArrayList listOfTricks) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.listOfTricks = new ArrayList<>();
        this.listOfTricks = listOfTricks;
    }


    public String getName() {
        return name;
    }

    public ArrayList getListOfTricks() {
        return listOfTricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }


    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                ", listOfTricks=" + listOfTricks +
                '}';
    }


}
