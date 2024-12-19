package org.example;

public abstract class Animal implements Movable{
    private final String name;
    private double starvationState;

    public Animal(String name) {
        this.name = name;
        this.starvationState = 1.0;
    }

    public String getName() {
        return name;
    }

    public double getStarvationState() {
        return starvationState;
    }

    public void setStarvationState(double starvationState) {
        this.starvationState = starvationState;
    }

    public abstract void getNourish();
}