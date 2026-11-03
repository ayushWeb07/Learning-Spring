package com.ayush.example6.beans;

public class Bike {
    private String name;
    private final Engine engine;

    public Bike(Engine engine) {
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
        return "Bike{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
