package org.example.nexabank.model;

import java.util.Scanner;

public class Pages {
    private Scanner scan = new Scanner(System.in);
    
    public void welcomePage()
    {
        // Welcome Page
        System.out.println("-------------------- Welcome To NexaBank --------------------");
        System.out.println("1. Login as a Manager");
        System.out.println("2. Login as a Customer");
        System.out.println("3. About Us");
        System.out.println("4. Exit");
    }

    
}
