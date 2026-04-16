package com.java.oop;

public class Main {

    static void main(String[] args) {
        //local variable
        Product product;
        product = new Product();
        product.id = 12;
        product.name = "APPLE iPhone 15 Pro (Blue Titanium, 512 GB)";
        product.maxRetailPrice = 164900;
        product.rating = 4.7F;
        product.reviewsCount = 3153;
        product.discountPercentage = 18;
        product.isAvailable = true;
        product.company = "Apple";
        product.category = "Mobile";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("             Product1");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ID: " + product.id);
        System.out.println("Name: " + product.name);
        System.out.println("Max Retail price :" + product.maxRetailPrice);
        System.out.println("Rating: " + product.rating);
        System.out.println("Reviews Count: " + product.reviewsCount);
        System.out.println("Discount Percentage: " + product.discountPercentage);
        System.out.println("Is Available: " + product.isAvailable);
        System.out.println("Company: "+ product.company);
        System.out.println("Category: " + product.category);


        // product 2

        Product product2 = new Product();
        product2.id = 19;
        product2.name = "Samsung Galaxy Watch8 (40mm,Bluetooth) (Dark Gray Strap, Small)";
        product2.maxRetailPrice = 32999;
        product2.rating = 4.4F;
        product2.reviewsCount = 532;
        product2.discountPercentage = 15;
        product2.isAvailable = true;
        product2.company = "Samsung";
        product2.category = "Watch";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("              Product2");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ID: " + product2.id);
        System.out.println("Name: " + product2.name);
        System.out.println("Max Retail price :" + product2.maxRetailPrice);
        System.out.println("Rating: " + product2.rating);
        System.out.println("Reviews Count: " + product2.reviewsCount);
        System.out.println("Discount Percentage: " + product2.discountPercentage);
        System.out.println("Is Available: " + product2.isAvailable);
        System.out.println("Company: "+ product2.company);
        System.out.println("Category: " + product2.category);


        //customer 1
        Customer customer;
        customer = new Customer();
        customer.id =258;
        customer.userName = "Balu";
        customer.age = 23;
        customer.gender = 'M';
        customer.contactNumber = 6358428972L;
        customer.eMail = "balur@gmail.com";
        customer.address = "H-NO: 10-5,manikonda,hyd,telangana";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("             Customer1");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ID: " + customer.id);
        System.out.println("Age: " +customer.age);
        System.out.println("Gender: " + customer.gender);
        System.out.println("Contact number: "+ customer.contactNumber);
        System.out.println("E-mail: " + customer.eMail);
        System.out.println("Address: " + customer.address);

        // Customer2

        Customer customer2 = new Customer();
        customer2.id =256;
        customer2.userName = "Anilkumar";
        customer2.age = 22;
        customer2.gender = 'M';
        customer2.contactNumber = 6358428974L;
        customer2.eMail = "anilkumar@gmail.com";
        customer2.address = "H-NO: 10-25,madhapur,hyd,telangana";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("             Customer2");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ID: " + customer2.id);
        System.out.println("Age: " +customer2.age);
        System.out.println("Gender: " + customer2.gender);
        System.out.println("Contact number: "+ customer2.contactNumber);
        System.out.println("E-mail: " + customer2.eMail);
        System.out.println("Address: " + customer2.address);
    }
}
