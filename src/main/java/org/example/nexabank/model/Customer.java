package org.example.nexabank.model;

public class Customer extends Person{
    private int customerId;
    private String accounts;

    public Customer(String name, String firstName, String email, String password)
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

}
