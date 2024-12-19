package org.example;

public class Person {
    private final String name;
    private final String surname;

    public Person(String name, String surname){
        this.name=name;
        this.surname=surname;

    }
    public String toString(){
        return "Person{name ='" +name+"', surname ='" +surname+"'}";
    }
    @Override
    public int hashCode() {
        return name.length() + surname.length();
    }
}
