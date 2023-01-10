package org.example;

abstract class Employee {
    private String Name;

    private int DateOfBirthdey;

    private boolean Compass;


    Employee(String name, int dateOfBirthdey, boolean compass) {
        Name = name;
        DateOfBirthdey = dateOfBirthdey;
        Compass = compass;
    }
}
