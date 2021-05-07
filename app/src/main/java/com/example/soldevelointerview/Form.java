package com.example.soldevelointerview;

public class Form {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isExperiencedInProgramming;

    public Form(String firstName, String lastName, int age, boolean isExperiencedInProgramming) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isExperiencedInProgramming = isExperiencedInProgramming;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isExperiencedInProgramming() {
        return isExperiencedInProgramming;
    }
}
