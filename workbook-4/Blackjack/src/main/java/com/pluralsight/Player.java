package com.pluralsight;

public class Player {
    private String name;
    private int score;

    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void addScore(int value) {
        score =+ value;
    }
}
