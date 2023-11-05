package org.chdtu;

public class Person {
    private Library library;
    private String surname;
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }


    public Person(Library library) {
        System.out.println("Person bean-constructor is created");
        this.library = library;
    }

    public void setLibrary(Library library) {
        System.out.println("Class Person: set Library");
        this.library = library;
    }

    public void YourOrder() {
        System.out.println("I want that...");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
