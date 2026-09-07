package org.example.nexabank;

import java.util.HashSet;

public class Account {
    private int accountId;
    private Long accountNumber;
    private int balance;
    private String accountType;
    private HashSet<Transaction> transactionHistory;
}