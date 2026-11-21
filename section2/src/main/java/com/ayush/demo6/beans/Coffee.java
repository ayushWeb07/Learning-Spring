package com.ayush.demo6.beans;

public class Coffee {
    private String name;

    public Coffee() {
        this.name= "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }
}
