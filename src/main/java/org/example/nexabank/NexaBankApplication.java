package org.example.nexabank;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NexaBankApplication {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        int choice = 0;

        System.out.println("Welcome to NexaBank");
        System.out.println("Login As: ");

        System.out.println("1. Customer");
        System.out.println("2. Manager");

        boolean invalid = true;

        while(invalid){
            choice = scan.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Monday");
                    invalid = false;
                    break;
            
                default:
                    System.out.println("Please Enter a Valid Number (1 - 2)");
                    
            }
        }
        scan.close();
    }

}
