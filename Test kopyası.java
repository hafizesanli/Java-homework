package org.example;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Ahmet", "Yilmaz");
        Person person2 = new Person("Zeki", "Demir");
        Person person3 = new Person("Mehmet", "Kavuk");

        Hash personHash = new Hash();
        personHash.add(person1);
        personHash.add(person2);
        personHash.add(person3);

        Hash integerHash = new Hash();
        integerHash.add(5);
        integerHash.add(7);
        integerHash.add(3);
        integerHash.add(5);

        Hash stringHash = new Hash();
        stringHash.add("John");
        stringHash.add("Eva");
        stringHash.add("Brad");

        System.out.println(personHash);
        System.out.println(integerHash);
        System.out.println(stringHash);
    }
}
