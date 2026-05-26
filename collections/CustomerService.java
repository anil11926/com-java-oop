package com.java.oop.collections;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer>customerList;
    public CustomerService(){
        customerList = new ArrayList<>();
    }
    public void displayCustomer(Customer customer){
        System.out.println("----------------------------------------------------");
        System.out.println("id : " + customer.id);
        System.out.println("name : " + customer.name);
        System.out.println("Email : " + customer.id);
        System.out.println("---------------------------------------------------");

    }
    public void displayAllCustomer(List<Customer>customers){
        for (Customer customer : customers){
            displayCustomer(customer);
        }
    }


    public List<Customer> getCustomer(){
        customerList.add(new Customer(111,"Customer1","customer1@gmial.com"));
        customerList.add(new Customer(222,"customer2","customer2@gmail.com"));
        customerList.add(new Customer(333,"Customer3","customer3@gmial.com"));
        customerList.add(new Customer(444,"Customer4","customer4@gmial.com"));
        customerList.add(new Customer(555,"customer5","customer5@gmail.com"));
        customerList.add(new Customer(222,"Customer2","customer2@gmial.com"));

        return customerList;
    }

    public Customer addCustomer(Customer customer) {
        customerList.add(customer);
        return customer;
    }



}
