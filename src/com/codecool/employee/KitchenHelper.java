package com.codecool.employee;

import com.codecool.Ingredient;
import com.codecool.util.MyRandom;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class KitchenHelper extends Employee {
    private Map<Ingredient, Integer> ingredients = new HashMap<>();

    public KitchenHelper(String name, String birthDay, float salary) {
        super(name, birthDay, salary);
        initIngredients();
    }

    private void initIngredients() {
        for (Ingredient ingredient : Ingredient.values()) {
            ingredients.put(ingredient, MyRandom.randomNumberInRange(3));
        }
    }

    public void yell() {
        System.out.println("We're all out, motherfucker!");
    }

    public void decreaseIngredients(Ingredient ingredient) {
        System.out.println("Ingredient: " + ingredient);
        ingredients.put(ingredient, ingredients.get(ingredient) - 1);
        System.out.println("Remaining " + ingredient + " " + getIngredient(ingredient));
    }

    public int getIngredient(Ingredient ingredient) {
        return ingredients.get(ingredient);
    }
}
