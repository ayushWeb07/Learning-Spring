package com.ayush.demo.beans;

public class Fighter {
    private String name;
    private int wins;
    private int losses;

    public Fighter(String name, int wins, int losses) {
        this.name= name;
        this.wins= wins;
        this.losses= losses;
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
