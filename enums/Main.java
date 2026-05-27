package com.java.oop.enums;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(
                "Anil Kumar",
                "anil@gmail.com",
                9876543210L,
                Gender.MALE
        );

        Employee employee2 = new Employee(
                "Priya",
                "priya@gmail.com",
                9123456780L ,
                Gender.FEMALE
        );

        employee1.displayCustomerDetails();

        System.out.println();

        employee2.displayCustomerDetails();
    }




}
