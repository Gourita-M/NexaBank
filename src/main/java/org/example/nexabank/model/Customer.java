package org.example.nexabank.model;

import java.util.HashMap;

public class Customer extends Person{
    private int customerId;
    private static int nextCustomerId = 0;
    private HashMap<Integer, Account> accounts = new HashMap<>();

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

}
