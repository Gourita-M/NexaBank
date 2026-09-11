package org.example.nexabank.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Save {

    public static void saveTransactionsHistory(String method,long accountNumber, int amount)
    {
        try {
            BufferedWriter writeHistory = new BufferedWriter( new FileWriter("AccountsHistory.txt", true));
                writeHistory.write(method + " | " + accountNumber + " | " + amount + " DH");
                writeHistory.newLine();

                writeHistory.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
