package com.ayush.example5.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    @Autowired
    public Car(@Qualifier("vTwelveEngine") Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
