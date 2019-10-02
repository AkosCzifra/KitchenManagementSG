package com.codecool.employee;

import com.codecool.Ingredient;
import com.codecool.IngredientGetter;
import com.codecool.util.MyRandom;

import java.util.Date;

public class Chef extends EmployeeWhoCanCook {
    private IngredientGetter ingredientGetter;

    public Chef(String name, String birthDay, float salary) {
        super(name, birthDay, salary);
    }

    @Override
    public void cook() {
        int randomNum = MyRandom.randomNumberInRange(10);
        if (randomNum > 5) {
            Ingredient ingredient = Ingredient.getRandomIngredient();
            System.out.println(ingredient);
            ingredientGetter.askForIngredient(ingredient);
        } else
            System.out.println("YOU ARE AN IDIOT SANDWICH!");
    }

    public void setIngredientGetter(IngredientGetter ingredientGetter) {
        this.ingredientGetter = ingredientGetter;
    }
}
