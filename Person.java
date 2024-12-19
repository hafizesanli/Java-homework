package org.example;

public class Person implements Comparable <Person> {
    private final String name;
    private final String surname;


    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;

    }
    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);

    }
    @Override
    public String toString(){ //Override toString() method
        return "name = " + name + ", surname = " + surname;
    }
}
