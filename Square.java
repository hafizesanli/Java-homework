package com.example;

public class Square extends Form{
    private final double a; //side of square

    public Square(double a){
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }
}
