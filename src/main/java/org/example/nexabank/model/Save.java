package org.example.nexabank.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Save {

    public void saveCustomers(HashMap<String, Customer> customers) {

        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("customers.txt"))) {

            // Go through every Customer
            for (Map.Entry<String, Customer> customerEntry
                    : customers.entrySet()) {

                String email = customerEntry.getKey();
                Customer customer = customerEntry.getValue();

                // Save Customer information
                writer.write(
                    "CUSTOMER|" +
                    email + "|" +
                    customer.getName()
                );

                writer.newLine();

                // Go through all accounts belonging to this Customer
                for (Map.Entry<Integer, Account> accountEntry
                        : customer.getAccounts().entrySet()) {

                    Integer accountId = accountEntry.getKey();
                    Account account = accountEntry.getValue();

                    // Save Account information
                    writer.write(
                        "ACCOUNT|" +
                        accountId + "|" +
                        account.getAccountType() + "|" +
                        account.getAccountNumber() + "|" +
                        account.getBalance()
                    );

                    writer.newLine();
                }
            }

            System.out.println("Data saved successfully.");

        } catch (IOException e) {

            System.out.println("Error while saving data.");
            e.printStackTrace();
        }
    }
}
