package com.java.oop.inheritance;

public class Main {
    static void main(String[] args) {
        Product product = new Product(12,"HP Victus",65000,(byte)15,4.5F,460, (short) 2025,"HP","Laptop" );
        Customer customer = new RegularCustomer(1,"balu",(byte)22,'M' , "balu@gmail.com",9035665164L,"Hyderabad Telangana","silver",50);
        Customer customer1 = new PremiumCustomer(5, "Nani",(byte)19, 'M',"nani@gmail.com", 1654164262L, "Shamshabad", "gold", 0);
        System.out.println("=== Regular Customer === ");
        customer.display(product);
        System.out.println("=== Premium Customer ===");
        customer1.display(product);

    }
}
