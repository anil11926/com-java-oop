package com.java.oop.exception;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        try {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter a number:  ");
                int number1 = scanner.nextInt();
                System.out.println("enter another number: ");
                int number2 = scanner.nextInt();
                System.out.println(number1 / number2);
                System.out.println("hello");
            }catch (ArithmeticException e) {
                System.out.println("enter valid number other than zero");
                input();
            }
            try {
                int[] ids = new int[5];
                ids[3] = 100;
            }catch (NegativeArraySizeException|ArrayIndexOutOfBoundsException e){
                System.out.println("some issues in array");
                input();
            }
            try {
                String username = getUsername();
                System.out.println(username.equals("anil"));
            }catch (NullPointerException e){
                System.out.println("null point exception");
                input();
            }
        } /*catch (ArithmeticException e) {
            System.out.println("enter valid number (other than zero)");
            input();
        }catch (NegativeArraySizeException e){
            System.out.println("array size cannot be negative");
            input();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bounds");
            input();
        }catch (NullPointerException e){
            System.out.println("null pointer exception");
            input();
        }*/
        catch (ArithmeticException e) {
            System.out.println("some internal error occured");
            System.out.println("Reason : " + e.getMessage());
            input();
        }


    }


    private static void input() {
        System.out.println("input continues");
    }

    private static String getUsername() {
        String username = null;
        // code to get this from user
        return username;
    }
}
