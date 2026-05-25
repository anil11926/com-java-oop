package com.java.oop.collections;

import java.util.List;

public class ListTest {
    void service(List<String> list){

    }

   public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        List<Customer> customers = customerService.getCustomers();
        for (Customer customer : customers){
            customerService.displayCustomer(customer);
        }
    }
}
