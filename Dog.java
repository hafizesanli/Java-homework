package org.example;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);

    }
    public void move(){
        System.out.println(getName() + " is galloping.");
    }

    // implementation of getNourish() method
    @Override
    public void getNourish() {
        double currentStarvationState = this.getStarvationState();
        this.setStarvationState(Math.max(currentStarvationState - 0.4, 0.0));
    }
}