package com.java.oop.exception;

import java.util.Scanner;

public class Transactions {
    static void main(String[] args) {
        int availbleBalance = 10000;
        String name = "anil";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount");
        
        int amount = scanner.nextInt();
       /* if (performTransaction(availbleBalance,amount)){
            printTransaction(name,amount);

        }*/
        try{
            if (performTransaction(availbleBalance,amount)) {
                printTransaction(name, amount);
            }
        }catch(InsufficientFundsException e){
                System.out.println(e.getMessage());
            }


    }

    private static void printTransaction(String name, int amount) {
        System.out.println("Transaction details: " + name +" "+amount);

    }

    private static boolean performTransaction(int availbleBalance, int amount) {
        if (amount> availbleBalance){
            throw new InsufficientFundsException("insufficient Funds , max withdrawal" + availbleBalance);
        }else {
            System.out.println("Transaction Successful");
            availbleBalance -= amount;
        }
        return true;
    }

}
