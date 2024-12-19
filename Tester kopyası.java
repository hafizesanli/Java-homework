package com.example;

public class Tester {
    public static void main(String[] args) {
        Form[] arr = new Form[5];
        arr[0] = new Triangle(12, 4);
        arr[1] = new Circle(7);
        arr[2] = new Square(9);
        arr[3] = new Rectangle(12,24);
        arr[4] = new Ellipse(4,10);

        double area = 0;
        for (Form f: arr){
            area += f.calculateArea();
        }
        System.out.println("Total area is "+ area);
    }
}
