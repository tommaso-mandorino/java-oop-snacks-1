package org.lessons.java.oop_snacks_1;

public class Student {

    private String firstName;
    private String lastName;
    private int age;

    Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    String getFullInformation() {
        return this.firstName + " " + this.lastName + ", " + this.age + " anni.";
    }
}