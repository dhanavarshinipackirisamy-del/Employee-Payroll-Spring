package com.bridgelabz.employeepayrollapp.model;

public class Employee {

    private static int counter = 1;

    private int id;
    private String name;
    private long salary;

    public Employee(String name, long salary) {
        this.id = counter++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public long getSalary() { return salary; }
}