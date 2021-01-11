package io.pragra.learning.sep;

public class Calculator {
    public static void main(String[] args) {
        Person person = new Person(19, "John");
        person.printDetails();
       // person.age=-1000000;
        person.printDetails();
        System.out.println(person.age);
    }
}
