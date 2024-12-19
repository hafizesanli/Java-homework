package org.example;

/*import java.util.Arrays;*/

public class PersonCollection {
    private final int numOfPeople;
    private final Person[] person;
    private int arraySize;
    public PersonCollection(int numOfPeople){
        this.numOfPeople= numOfPeople;
        this.person = new Person[numOfPeople];
        this.arraySize= 0;
    }

    public void add(String name, String surname){
        if(arraySize<numOfPeople){ // for cases where the capacity (numOfPeople) is larger than arraySize
            Person person1 = new Person(name, surname);
            person[arraySize] = person1;
            arraySize ++;
        }

    }
    public void sort() {
       /* Arrays.sort(person,numOfPeople,arraySize);*/ //
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arraySize - 1; i++) {
                if (person[i].compareTo(person[i + 1]) > 0) {
                    // Swap elements
                    Person temp = person[i];
                    person[i] = person[i + 1];
                    person[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    @Override
    public String toString(){ //Override toString method
        StringBuilder a = new StringBuilder(); //Adding custom output to StringBuilder object
        for(int i = 0; i< arraySize; i++){
            a.append(person[i].toString()).append("\n");
        }
        return a.toString();

    }

}
