package org.example.nexabank.main;

import java.util.HashMap;
import java.util.Scanner;

import org.example.nexabank.model.Account;
import org.example.nexabank.model.Customer;
import org.example.nexabank.model.Manager;
import org.example.nexabank.model.Pages;
import org.example.nexabank.model.Transaction;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        //Users Accounts
        HashMap<String, Customer> customersAccounts = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        //Models hena
        Account account = new Account();
        //Customer customer = new Customer();
        Pages pages = new Pages();
        Transaction transaction = new Transaction();

        //Testing Manager
        Manager manager = new Manager("Mouad Gourita","Mouad","mouad.gourita@gmail.com","12345");

        int choice = 0;
        boolean picked = false;

        while(!picked){
            pages.welcomePage();
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    boolean exists = pages.managerLoginPage(manager);
                    if(exists){
                    picked = true;
                    }
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
