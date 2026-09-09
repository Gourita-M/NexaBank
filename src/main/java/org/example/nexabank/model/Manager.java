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

    public void managerBoard()
    {
        int managerChoice = 0;
        boolean exit = false;

        while(!exit){
            System.out.println("-------------------- Welcome Back " + getFirstName() + "--------------------");
            System.out.println("1. Create a Customer Account");
            System.out.println("2. Modify a Customer Account");
            System.out.println("3. Close a Customer Account");
            System.out.println("4. View Customer Statement");
            System.out.println("5. Exit");

            managerChoice = scan.nextInt();

            switch (managerChoice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
            
                default:
                    break;
            }
        }
        
    }
}
