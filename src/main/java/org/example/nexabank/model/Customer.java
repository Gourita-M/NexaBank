package org.example.nexabank.model;

import java.util.HashMap;
import java.util.Scanner;

public class Customer extends Person{
    private int customerId;
    private int accountId = 1;
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private Scanner scan = new Scanner(System.in);

    public Customer(String name, String firstName, String email, String password, Account account)
    {
        super(name, firstName, email, password);
        accounts.put(accountId++, account);
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
        boolean exit = true;

        while(exit){
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
                    System.err.println("-------------------- Accounts Balance --------------------");

                    for (Account account : accounts.values()) {
                        System.err.println("Your " + account.getaccountType() + " Account '" + account.getAccountNumber() + "' : " + account.getBalance() + "DH");
                        
                    }
                    break;
                    
                case 2:
                    System.err.println("-------------------- Deposit / Withdrawal --------------------");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdrawal");
                    System.out.println("3. Exit");
                    int depoWithd = 0;
                    int counter = 0;
                    depoWithd = scan.nextInt();
                    switch(depoWithd){
                        case 1:
                            counter = 0;
                        System.err.println("-------------------- Choose an Account --------------------");
                        for(Account account : accounts.values()){
                            counter++;
                            System.out.println(counter + ". " + account.getaccountType() + " Account '" + account.getAccountNumber() + "' : ");
                        }
                        int accountId = scan.nextInt();
                        System.out.println("Amount: ");
                        int amount = scan.nextInt();
                        if(amount <= 0){
                            System.err.println("You Can't Deposit This Amount");
                            break;
                        }
                        accounts.get(accountId).setbalance(amount);

                        break;
                        case 2: 
                        //     counter = 0;
                        // for(Account account : accounts.values()){
                        //     counter++;
                        //     System.out.println(counter + ". " +account.getaccountType() + " Account '" + account.getAccountNumber() + "' : ");
                        // }

                        case 3:
                            break;
                    }
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
