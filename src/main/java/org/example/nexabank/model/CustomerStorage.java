package org.example.nexabank.model;

import java.util.HashMap;

public class CustomerStorage {

    private static HashMap<String, Customer> customersAccounts = new HashMap<>();

    public static void setCustomersStorage(String email, Customer customer)
    {
        customersAccounts.put(email, customer);
    }

    public static HashMap<String, Customer> getCustomersStorage()
    {
        return customersAccounts;
    }
}
