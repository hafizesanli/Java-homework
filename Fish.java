package org.example;

public class Fish extends Animal{

    public Fish(String name) {
        super(name);

    }

    public void move() {
        System.out.println(getName() + " is swimming.");
    }



    // implementation of getNourish() method
    @Override
    public void getNourish() {
        double currentStarvationState = this.getStarvationState();
        this.setStarvationState(Math.max(currentStarvationState - 0.1, 0.0));
    }
}