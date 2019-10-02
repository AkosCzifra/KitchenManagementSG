package com.codecool;

import com.codecool.employee.Chef;
import com.codecool.employee.Cook;
import com.codecool.employee.KitchenHelper;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Kitchen kitchen = new Kitchen();
        Chef chef = new Chef("Gordon Ramsay", "1900-01-01", 500000000000.f);
        Cook cook = new Cook("Stahl Judit", "1950-02-02", 1f);
        KitchenHelper kitchenHelper1 = new KitchenHelper("Király Dani", "1946-06-07", 0f);
        KitchenHelper kitchenHelper2 = new KitchenHelper("Bubu", "1956-06-07", 0f);
        kitchen.setChef(chef);
        kitchen.setCooks(cook);
        kitchen.setKitchenHelpers(kitchenHelper1);
        kitchen.setKitchenHelpers(kitchenHelper2);
        kitchen.simulate();
    }
}
