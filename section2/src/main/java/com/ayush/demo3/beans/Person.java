package com.ayush.demo3.beans;

public class Person {
    private final String name;
    private final Vehicle vehicle;

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
