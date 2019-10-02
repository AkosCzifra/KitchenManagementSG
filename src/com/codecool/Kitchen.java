package com.codecool;

import com.codecool.employee.*;

import java.util.ArrayList;
import java.util.List;

public class Kitchen implements IngredientGetter {
    private List<EmployeeWhoCanCook> employeesWhoCanCooks = new ArrayList<>();
    private Chef chef;
    private List<Cook> cooks = new ArrayList<>();
    private List<KitchenHelper> kitchenHelpers = new ArrayList<>();


    @Override
    public void askForIngredient(Ingredient ingredient) {
        for (KitchenHelper kitchenHelper : kitchenHelpers) {
            if (kitchenHelper.getIngredient(ingredient) >= 1) {
                kitchenHelper.decreaseIngredients(ingredient);
                return;
            }
        }
        for (KitchenHelper kitchenHelper : kitchenHelpers) {
            kitchenHelper.yell();
        }
    }

    public void setChef(Chef chef) {
        chef.setHasKnifeSet(true);
        chef.setIngredientGetter(this);
        this.chef = chef;
        employeesWhoCanCooks.add(chef);
    }

    public void setCooks(Cook cook) {
        cook.setHasKnifeSet(true);
        cooks.add(cook);
        employeesWhoCanCooks.add(cook);
    }

    public void setKitchenHelpers(KitchenHelper kitchenHelper) {
        kitchenHelpers.add(kitchenHelper);
    }

    public void simulate() {
        for (int i = 0; i < 20; i++) {
            for (EmployeeWhoCanCook employeeWhoCanCook : employeesWhoCanCooks) {
                employeeWhoCanCook.cook();
            }
        }
    }
}