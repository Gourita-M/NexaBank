package org.example.nexabank.model;

import java.util.Scanner;

public class Pages {
    private Scanner scan = new Scanner(System.in);
    
    public void welcomePage()
    {
        // Welcome Page
        System.out.println("-------------------- Welcome To NexaBank --------------------");
        System.out.println("1. Login as a Manager");
        System.out.println("1. Login as a Customer");
        System.out.println("2. About Us");
        System.out.println("3. Exit");
    }

    public Boolean managerLoginPage(Manager manager)
    {
        System.out.println("Enter Your Email");
        String email = scan.nextLine();

        if(!email.equals(manager.getEmail())){
            System.err.println("Invalid Email Please Try Again");
            return false;
        }
        
        System.out.println("Enter Your Password");
        String password = scan.nextLine();

        return false;

    }
}
