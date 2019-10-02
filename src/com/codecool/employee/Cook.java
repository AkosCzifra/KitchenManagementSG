package com.codecool.employee;

import java.util.Date;

public class Cook extends EmployeeWhoCanCook {

    public Cook(String name, String birthDay, float salary) {
        super(name, birthDay, salary);
    }

    @Override
    public void cook() {
        System.out.println("I'm currently cooking, motherfucker!");
    }
}
