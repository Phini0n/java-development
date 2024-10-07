package com.pluralsight;

public class Character {
    private String name;
    private int health ;
    private int strength;
    private int agility;
    StringBuilder sb = new StringBuilder();

    // Constructors
    public Character(String name, int strength, int agility) {
        this.name = name;
        this.health = 100;
        this.strength = strength;
        this.agility = agility;
    }

    public Character(String name) { this(name, 10, 10); }

    // Methods
    public String getDescription() {
        return this.name.substring(0, 1).toUpperCase() + this.name.substring(1).toLowerCase();
    }

    public String getHealthStatus() {
        return this.health + " HP";
    }

    public String getFullStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getDescription()).append("\n");
        sb.append("Health: ").append(getHealthStatus()).append("\n");
        sb.append("Strength: ").append(strength).append(" STR \n");
        sb.append("Agility: ").append(agility).append(" AGI \n");
        return sb.toString();
    }

    // Getters & Setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getHealth() { return health; }

    public void setHealth(int health) { this.health = Math.max(health, 0); }

    public int getStrength() { return strength; }

    public void setStrength(int strength) { this.strength = strength; }

    public int getAgility() { return agility; }

    public void setAgility(int agility) { this.agility = agility; }
}
