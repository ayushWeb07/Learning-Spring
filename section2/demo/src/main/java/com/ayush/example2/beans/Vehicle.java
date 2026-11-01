package com.ayush.example2.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String brand;
    private String model;
    private int wheels;

    @PostConstruct
    public void initialize() {
        this.brand= "";
        this.model= "";
        this.wheels= 0;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Vehicle is being destroyed...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}

