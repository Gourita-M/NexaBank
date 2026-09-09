package org.example.nexabank.main;

import java.util.Scanner;

import org.example.nexabank.model.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Models hena
        Account account = new Account();
        Customer customers = new Customer();
        Manager manager = new Manager();
        Pages pages = new Pages();
        Transaction transaction = new Transaction();

        //Users Accounts
        
        
        int choice = 0;
        boolean picked = false;

        while(!picked){
            pages.welcomePage();
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    pages.loginPage();
                    picked = true;
                    break;
                case 2:
                    System.out.println("We Are Who We Are The Green Team");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("invalid Try Again: ");

            }
        }


        scan.close();
    }

}
