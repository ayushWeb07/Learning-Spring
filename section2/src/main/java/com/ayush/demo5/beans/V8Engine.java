package com.ayush.demo5.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("v8Engine")
@Primary
public class V8Engine implements Engine {
    private String name;

    public V8Engine() {
        this.name= "";
    }

    @PostConstruct
    void init() {
        this.name= "V8 Turbo Engine";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "V8Engine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void printEngineDetails() {
        System.out.println(this.name + " broom broom...");
    }
}
