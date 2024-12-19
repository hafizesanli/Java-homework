package com.example;

public class Rectangle extends Form{
    private final double height;
    private final double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
