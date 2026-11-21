package com.ayush.demo5.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component("v12Engine")
public class V12Engine implements Engine {
    private String name;

    public V12Engine() {
        this.name= "";
    }

    @PostConstruct
    void init() {
        this.name= "V12 Turbo Engine";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "V12Engine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void printEngineDetails() {
        System.out.println(this.name + " broom broom...");
    }
}
