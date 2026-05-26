package com.java.oop.enums;

import com.java.oop.strings.Customer1;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(
                "Anil Kumar",
                "anil@gmail.com",
                9876543210L,
                Gender.MALE
        );

        Customer customer2 = new Customer(
                "Priya",
                "priya@gmail.com",
                9123456780L,
                Gender.FEMALE
        );

        customer1.displayCustomerDetails();

        System.out.println();

        customer2.displayCustomerDetails();
    }




}
