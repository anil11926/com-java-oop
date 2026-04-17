package com.java.oop;

public class Customer {
    int id;
    String userName;
    String email;
    long contactNumber;
    byte age;
    char gender;
    String address;

    // arg constructor
    public Customer(int id, String userName, String email, long contactNumber, byte age, char gender, String address) {
        System.out.println("Constructor called");
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
// No-arg constructor
    public Customer() {
        System.out.println("Constructor called");
        id = 123;
        userName = "Balu Aadiila";
        email = "balu@g,mail.com";
        contactNumber = 348789515;
        age = 22;
        gender = 'M';
        address = ";hyderabad";
// not arg constructor





    }
}
