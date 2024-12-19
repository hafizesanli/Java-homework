package org.example;

public class Tester {
    public static void main(String[] args) {
        PersonCollection personCollection = new PersonCollection(10);
        personCollection.add("Emily", "Williams");
        personCollection.add("Jessica", "Byrne");
        personCollection.add("Sophie", "Miller");
        personCollection.add("Olivia", "Garcia");
        personCollection.add("Jack", "Wilson");

        System.out.println("Before Sorting");
        System.out.println(personCollection);

        personCollection.sort();

        System.out.println("After Sorting");
        System.out.println(personCollection);

    }
}
