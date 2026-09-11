package org.example.nexabank.main;

import java.util.Scanner;

import org.example.nexabank.model.Account;
import org.example.nexabank.model.Customer;
import org.example.nexabank.model.CustomerStorage;
import org.example.nexabank.model.Manager;
import org.example.nexabank.model.Pages;
import org.example.nexabank.model.Transaction;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        
        //Users Accounts
        // HashMap<String, Customer> customersAccounts = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        //Models hena
        Pages pages = new Pages();
        Transaction transaction = new Transaction();

        //Testing Manager and Customer
        Manager manager = new Manager(1, "Mouad Gourita","Mouad","mouad","12345");
        Account account = new Account("Saving");
        Account accountz = new Account("Spending");
        Customer newCustomer = new Customer("mm", "aa", "aaa", "12345", account);
        newCustomer.setAccounts(accountz);
        //customersAccounts.put("aaa", newCustomer);
        CustomerStorage.setCustomersStorage("aaa", newCustomer);

        int choice = 0;
        boolean picked = false;

        while(!picked){
            pages.welcomePage();
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1: //login as Manager
                    System.out.println("Enter Your Email");
                    String email = scan.nextLine();
                    
                    System.out.println("Enter Your Password");
                    String password = scan.nextLine();
                    
                    boolean passed = manager.login(email, password);

                    if(passed){
                        manager.managerBoard();
                        // if(ada == null){
                        //     break;
                        // }
                        // CustomerStorage.setCustomersStorage(ada.getEmail(), ada);
                    }
                    break;

                case 2: //login as Customer
                    System.out.println("Enter Your Email");
                    String customerEmail = scan.nextLine();
                    
                    System.out.println("Enter Your Password");
                    String customerPassword = scan.nextLine();

                    boolean pass = CustomerStorage.getCustomersStorage().get(customerEmail).login(customerEmail, customerPassword);
                    if(pass){
                        CustomerStorage.getCustomersStorage().get(customerEmail).customerBoard();
                    }

                    break;

                case 3:
                    System.out.println("We Are Who We Are The Green Team");
                    break;
                case 4:
                    System.out.println("Come Back Soon . We Want Your Money");
                    picked = true;
                    break;
                default:
                    System.out.println("invalid Try Again: ");

            }
        }

        scan.close();
    }

}
