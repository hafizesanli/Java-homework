package com.example;

public class Circle extends Form{
    private final double r; // radius

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
