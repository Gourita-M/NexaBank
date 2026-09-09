package org.example.nexabank.model;

import java.util.HashSet;
import java.util.Scanner;

public class Account {
    private int accountId;
    private Long accountNumber;
    private int balance;
    private String accountType;
    private HashSet<Transaction> transactionHistory;
    private Scanner scanner;
}