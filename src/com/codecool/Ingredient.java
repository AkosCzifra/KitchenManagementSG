package com.codecool;

import com.codecool.util.MyRandom;

public enum Ingredient {
    POTATO,
    CARROT,
    MEAT;

    public static Ingredient getRandomIngredient() {
        return Ingredient.values()[MyRandom.randomNumberInRange(Ingredient.values().length)];
    }
}
