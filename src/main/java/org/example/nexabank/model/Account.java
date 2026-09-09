package org.example.nexabank.model;

import java.util.HashSet;
import java.util.Random;

public class Account {
    private int accountId;
    private static int nextAccountId = 0;
    private Long accountNumber;
    private int balance;
    private String accountType;
    private HashSet<Transaction> transactionHistory;

    public Account(String accountType)
    {
        this.accountId = nextAccountId++;
        Random random = new Random();
        
        long number = 10000000000000L + (long)(random.nextDouble() * 90000000000000L);
        this.accountNumber = number;
        this.balance = 0;
        this.accountType = accountType;
    }
    public void setbalance(int balance){
        this.balance = balance;
    }
    public int getAccountId(){
        return accountId;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public String getaccountType(){
        return accountType;
    }

    
}