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
        Customer newCustomer = null;

        while(!exit){
            System.out.println("-------------------- Welcome Back " + getFirstName() + "--------------------");
            System.out.println("1. Create a Customer Account");
            System.out.println("2. Modify a Customer Account");
            System.out.println("3. Close a Customer Account");
            System.out.println("4. View Customer Statement");
            System.out.println("5. Logout");

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

                    Account account = new Account("Spending");
                    
                    newCustomer = new Customer(name, name, email, password, account);
                    CustomerStorage.setCustomersStorage(email, newCustomer);

                    System.out.println("New Customer " + name + " Is Created");
                    break;
                    
                case 2: //Modify a Customer
                    System.err.println("------------- Modifying a New Customer -------------");
                    System.err.println("");
                    System.err.println("Please Enter The User Email: ");
                    String customerEmail = scan.nextLine();

                    System.out.println("User: " + CustomerStorage.getCustomersStorage().get(customerEmail).getFirstName()
                                         + "  |  "  + CustomerStorage.getCustomersStorage().get(customerEmail).getEmail());

                    System.err.println("");

                    System.err.println("New Name: ");
                    String newFirstName = scan.nextLine();
                    System.err.println("New Email: ");
                    String newEmail = scan.nextLine();

                    CustomerStorage.getCustomersStorage().get(customerEmail).setfirstName(newFirstName);
                    CustomerStorage.getCustomersStorage().get(customerEmail).setemail(newEmail);

                    System.out.println(CustomerStorage.getCustomersStorage().get(customerEmail).getEmail());

                    System.err.println("User Info is Changed");
                    
                    break;
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
