package com.ayush.example5.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("vEightEngine")
@Primary
public class V8Engine implements Engine {
    @Override
    public String printInfo() {
        return "I'm a V8 Engine";
    }
}
