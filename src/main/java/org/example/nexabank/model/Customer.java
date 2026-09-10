package org.example.nexabank.model;

import java.util.HashMap;
import java.util.Scanner;

public class Customer extends Person{
    private int customerId;
    private static int nextCustomerId = 0;
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private Scanner scan = new Scanner(System.in);

    public Customer(String name, String firstName, String email, String password, Account account)
    {
        super(name, firstName, email, password);
        customerId = nextCustomerId++;
        accounts.put(customerId, account);
    }

    public boolean login(String email, String password)
    {
        
        if(email.equals(getEmail())){
            if(password.equals(getPassword())){
                return true;
            }
        }

        System.out.println("Invalid Informations. Please Try again");

        return false;
        
    }

    public void customerBoard()
    {
        int customerChoice = 0;
        boolean exit = false;

        while(!exit){
            System.out.println("-------------------- Welcome Back " + getFirstName() + " --------------------");
            System.out.println("1. View Account Balance");
            System.out.println("2. Deposit / Withdrawal");
            System.out.println("3. Transfer Between Accounts");
            System.out.println("4. View Statement");
            System.out.println("5. Logout");

            customerChoice = scan.nextInt();
            scan.nextLine();

            switch (customerChoice) {
                case 1:
                    System.err.println("-------------------- Account Balance --------------------");
                    System.out.println("Pick Which Account");
                    
                    System.out.println("Pick Which Account");

                    break;
                    
                case 2:
                    
                    
                case 3:
                    
                    
                case 4:
                    

                case 5:
                    exit = true;
                    break;

                default:
                    break;
            }
        }
        
    }

}
