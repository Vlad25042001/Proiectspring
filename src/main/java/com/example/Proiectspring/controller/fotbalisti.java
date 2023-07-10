package com.example.Proiectspring.controller;

public class fotbalisti extends echipe {

    private int number;
    private String name;
    private String team;

    public fotbalisti(int number, String name, String team) {
        super(team);
        this.number = number;
        this.name = name;
        this.team = team;


    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }



    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
