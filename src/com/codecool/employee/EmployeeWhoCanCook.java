package com.codecool.employee;

import java.util.Date;

public abstract class EmployeeWhoCanCook extends Employee {
    protected  boolean hasKnifeSet;

    public EmployeeWhoCanCook(String name, String birthDay, float salary) {
        super(name, birthDay, salary);
    }

    public abstract void cook();

    public void setHasKnifeSet(boolean hasKnifeSet) {
        this.hasKnifeSet = hasKnifeSet;
    }
}
