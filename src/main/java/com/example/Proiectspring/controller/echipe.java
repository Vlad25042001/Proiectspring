package com.example.Proiectspring.controller;

public class echipe {
    private String team;
    private int ranking;

    public echipe(String team, int ranking) {
        this.team = team;
        this.ranking = ranking;
    }

    public echipe(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
