package org.example.nexabank.model;

import java.util.Scanner;

public class Manager extends Person{
    private int managerId;
    private Scanner scan = new Scanner(System.in);

    public Manager(int managerId,String name, String firstName, String email, String password)
    {
        super(name, firstName, email, password);
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

    public Customer managerBoard()
    {
        int managerChoice = 0;
        boolean exit = false;
        Customer newCustomer = null;

        while(!exit){
            System.out.println("-------------------- Welcome Back " + getFirstName() + "--------------------");
            System.out.println("1. Create a Customer Account");
            System.out.println("2. Modify a Customer Account");
            System.out.println("3. Close a Customer Account");
            System.out.println("4. View Customer Statement");
            System.out.println("5. Exit");

            managerChoice = scan.nextInt();
            scan.nextLine();

            switch (managerChoice) {
                case 1:
                    System.err.println("------------- Creating a New Customer -------------");
                    System.err.println("Enter Customer Name: ");
                    String name = scan.nextLine();
                    System.err.println("Enter Customer email: ");
                    String email = scan.nextLine();
                    // for now l password will be added by the Managers Later I'll Change it so the user will add his password when he join's the first time
                    // or he must change it when he login the First time
                    System.err.println("Enter Customer password: ");
                    String password = scan.nextLine();

                    Account account = new Account("Saving");
                    
                    //String name, String firstName, String email, String password)
                    newCustomer = new Customer(name, name, email, password, account);

                    System.out.println("New Customer " + name + " Is Created");
                    break;
                    
                // case 2:
                //     return newCustomer;
                    
                // case 3:
                //     return newCustomer;
                    
            
                default:
                    break;
            }
        }
        return newCustomer;
    }
}
