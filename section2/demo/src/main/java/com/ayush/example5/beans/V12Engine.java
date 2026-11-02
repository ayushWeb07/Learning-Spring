package com.ayush.example5.beans;

import org.springframework.stereotype.Component;

@Component("vTwelveEngine")
public class V12Engine implements Engine{
    @Override
    public String printInfo() {
        return "I'm a V12 Engine";
    }
}
