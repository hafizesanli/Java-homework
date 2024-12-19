package org.example;

public class Test {
    public static void main(String[] args) {
        Movable[] movables = new Movable[5];
        movables[0] = new Car("Opel", 2001);
        movables[1] = new Dog("Terrier");
        movables[2] = new Truck("MAN" , 1992);
        movables[3] = new Van("Mercedes" , 2019);
        movables[4] = new Fish("Goldfish");


        for (Movable movable : movables) {
            movable.move();
        }
    }
}