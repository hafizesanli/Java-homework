package com.example;

public class Ellipse extends Form{
    private double verRadius; // vertical radius
    private double horRadius; // horizontal radius

    public Ellipse(double verRadius, double horRadius){
        this.horRadius = horRadius;
        this.verRadius = verRadius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * verRadius * horRadius;
    }
}
