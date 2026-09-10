package org.example.nexabank.model;

import java.util.HashSet;
import java.util.Random;

public class Account {
    private int accountId;
    private static int nextAccountId = 1;
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
    public void setbalance(int amount){
        this.balance = amount;
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

    public void withdrawal(int amount)
    {
        if(amount > getBalance()){
            System.out.println("You Don't Have Enough Money in Your Account ");
            System.out.println("Your Balance is: " + getBalance());
            
        }else{
            setbalance(getBalance() - amount);
        }
        
    }

}