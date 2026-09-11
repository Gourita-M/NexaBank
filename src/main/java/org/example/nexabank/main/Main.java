package org.example.nexabank.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.example.nexabank.model.*;
import java.util.HashMap;
import java.util.Scanner;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        //Users Accounts
        HashMap<String, Customer> customersAccounts = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        //Models hena
        Pages pages = new Pages();
        Transaction transaction = new Transaction();

        //Testing Manager and Customer
        Manager manager = new Manager(1, "Mouad Gourita","Mouad","mouad","12345");
        Account account = new Account("Saving");
        Account accountz = new Account("Saving");
        Customer newCustomer = new Customer("mm", "aa", "aaa", "12345", account);
        newCustomer.addAccount(accountz);
        customersAccounts.put("aaa", newCustomer);

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
                    }
                    break;

                case 2:
                    System.out.println("Enter Your Email");
                    String customerEmail = scan.nextLine();
                    
                    System.out.println("Enter Your Password");
                    String customerPassword = scan.nextLine();

                    boolean pass = customersAccounts.get(customerEmail).login(customerEmail, customerPassword);
                    if(pass){
                        customersAccounts.get(customerEmail).customerBoard();
                    }

                    break;

                case 3:
                    System.out.println("We Are Who We Are The Green Team");
                    break;
                case 4:
                    System.out.println("Come Back Soon . We Want Your Mony");
                    picked = true;
                    break;
                default:
                    System.out.println("invalid Try Again: ");

            }
        }

        scan.close();
        Save save = new Save();
        save.saveCustomers(customersAccounts);
    }

}
