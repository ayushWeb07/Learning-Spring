package com.ayush.demo5.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name;
    private final Engine engine;

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
        this.name= "";
    }

    @PostConstruct
    void init() {
        this.name= "Astron martin db12";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
