package com.codecool.employee;

import java.util.Date;

public abstract class Employee {
    protected String name;
    protected String birthDay;
    protected float salary;

    public Employee(String name, String birthDay, float salary) {
        this.name = name;
        this.birthDay = birthDay;
        this.salary = salary;
    }

    public void reportTax() {
        System.out.println("Salary: " + salary * 0.01);
    }
}
