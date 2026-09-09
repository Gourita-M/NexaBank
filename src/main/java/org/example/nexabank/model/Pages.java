package org.example.nexabank.model;

import java.util.Scanner;

public class Pages {
    private Scanner scan = new Scanner(System.in);
    
    public void welcomePage()
    {
        // Welcome Page
        System.out.println("-------------------- Welcome To NexaBank --------------------");
        System.out.println("1. Login to The Platform");
        System.out.println("2. About Us");
        System.out.println("3. Exit");
    }

    public void loginPage()
    {
        System.out.println("Enter Your Email");
        String email = scan.nextLine();
        
        System.out.println("Enter Your Password");
        String password = scan.nextLine();

        System.out.println(email + password);

    }
}
