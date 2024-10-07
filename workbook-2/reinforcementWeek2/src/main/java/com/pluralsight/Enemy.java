package com.pluralsight;

public class Enemy {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int damage){
        this.name = name;
        this.health = 100;
    }

    // Getters & Setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getHealth() { return health; }

    public void setHealth(int health) { this.health = Math.max(health, 0); }

    public int getDamage() { return damage; }

    public void setDamage(int damage) { this.damage = damage; }
}

