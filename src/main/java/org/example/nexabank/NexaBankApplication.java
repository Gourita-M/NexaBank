package org.example.nexabank;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class NexaBankApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int choice = 0;

        System.out.println("Welcome to NexaBank");
        System.out.println("Login As: ");

        choice = scan.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Monday");
                break;
        
            default:
                break;
        }
    }

}
