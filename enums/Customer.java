package com.java.oop.enums;

public class Customer {
    private String name ;
    private  String email;
    private long phoneNumber;
    private Gender gender;


    public Customer(String name, String email, long phoneNumber, Gender gender) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    //getters

    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }
    //setters


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void displayCustomerDetails(){
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Phone Number : "+ phoneNumber);
        System.out.println("Gender : " + gender);
    }
}
