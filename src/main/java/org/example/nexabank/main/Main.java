package org.example.nexabank.main;

import java.util.HashMap;
import java.util.Scanner;

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
        Pages pages = new Pages();
        Transaction transaction = new Transaction();

        //Testing Manager
        Manager manager = new Manager(1, "Mouad Gourita","Mouad","mouad","12345");

        int choice = 0;
        boolean picked = false;

        while(!picked){
            pages.welcomePage();
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter Your Email");
                    String email = scan.nextLine();
                    
                    System.out.println("Enter Your Password");
                    String password = scan.nextLine();
                    
                    boolean passed = manager.login(email, password);

                    if(passed){
                        Customer ada = manager.managerBoard();
                        if(ada == null){
                            break;
                        }
                        customersAccounts.put(ada.getEmail(), ada);
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
