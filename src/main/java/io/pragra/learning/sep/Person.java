package io.pragra.learning.sep;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void printDetails(){
        System.out.println("name---->"+name);
        System.out.println("age---->"+age);

    }

    public static void main(String[] args) {
        Person person = new Person(19,"john");
        person.printDetails();
    }
}
