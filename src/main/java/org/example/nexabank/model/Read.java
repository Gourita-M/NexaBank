package org.example.nexabank.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    
    public static void accountStatment(Long accountNumber)
    {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("AccountsHistory.txt"));

            String line;
            boolean isEmpty = true;

            System.out.println("================================");
            System.out.println("       ACCOUNT STATEMENT");
            System.out.println("================================");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("");
            System.out.println("Transaction     Amount");

            while((line = reader.readLine()) != null){
                String[] parts = line.split("\\|");
                if(Long.toString(accountNumber).equals(parts[1].trim())){
                    System.err.println(parts[0].trim() + "     :   " + parts[2].trim());
                    isEmpty = false;
                }
                
            }
                if(isEmpty){
                    System.err.println("You Have No Activities on This Account");
                }

            System.err.println("");
            System.out.println("Later Nekhalih Able to Download it as a PDF: Click Here");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// ================================
//        ACCOUNT STATEMENT
// ================================
// Account: 98865463653475

// Transaction    Amount
// Deposit        +12441 DH
// Withdraw       -2000 DH
// Deposit        +5000 DH
// Withdraw       -1000 DH

// Total deposited: 17441 DH
// Total withdrawn: 3000 DH
// ================================