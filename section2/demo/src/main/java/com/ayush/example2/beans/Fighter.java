package com.ayush.example2.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Fighter {
    private String name;
    private int wins;
    private int losses;

    @PostConstruct
    public void initialize() {
        this.name= "";
        this.wins= 0;
        this.losses= 0;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Fighter is being destroyed...");
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
