package com.ayush.example6.beans;

public class Car {
    private String name;
    private final Engine engine;

    public Car(Engine engine) {
        this.engine= engine;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
