package org.example.nexabank.model;

import java.util.HashMap;
import java.util.Scanner;

public class Customer extends Person{
    private int customerId;
    private static int accountId = 1;
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private Scanner scan = new Scanner(System.in);

    public Customer(String name, String firstName, String email, String password, Account account)
    {
        super(name, firstName, email, password);
        accounts.put(accountId++, account);
    }
    public HashMap<Integer, Account> getAccounts()
    {
        return accounts;
    }

    public void setAccounts(Account account)
    {
        accounts.put(accountId++, account);
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

    public void transfer(int from, int to,int amount)
    {
        if(accounts.get(from).getBalance() < amount){
            System.out.println("Invalid Amount, Not Enough Balance");
            return;
        }
        accounts.get(from).withdrawal(amount);

        accounts.get(to).setbalance(accounts.get(to).getBalance() + amount);
    }

    public void customerBoard()
    {
        int customerChoice = 0;
        boolean exit = true;

        while(exit){
            System.out.println("-------------------- Welcome Back " + getFirstName() + " --------------------");
            System.out.println("1. View Account Balance");
            System.out.println("2. Deposit / Withdrawal");
            System.out.println("3. Transfer Between Accounts");
            System.out.println("4. Add New Saving/ Account");
            System.out.println("5. View Statement");
            System.out.println("6. Logout");

            customerChoice = scan.nextInt();
            scan.nextLine();

            switch (customerChoice) {
                case 1:
                    System.err.println("-------------------- Accounts Balance --------------------");

                    for (Account account : accounts.values()) {
                        System.err.println("Your " + account.getAccountType() + " Account '" + account.getAccountNumber() + "' : " + account.getBalance() + "DH");
                        
                    }
                    break;
                    
                case 2:
                    System.err.println("-------------------- Deposit / Withdrawal --------------------");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdrawal");
                    System.out.println("3. Exit");
                    int depoWithd = 0;
                    int counter = 0;
                    depoWithd = scan.nextInt();
                    switch(depoWithd){
                        case 1:
                            counter = 0;
                        System.err.println("-------------------- Choose an Account --------------------");
                        for(Account account : accounts.values()){
                            counter++;
                            System.out.println(counter + ". " + account.getAccountType() + " Account '" + account.getAccountNumber() + "' : " + account.getBalance() + " DH");
                        }
                        int accountId = scan.nextInt();
                        System.out.println("Amount: ");
                        int amount = scan.nextInt();
                        if(amount <= 0){
                            System.err.println("You Can't Deposit This Amount");
                            break;
                        }
                        accounts.get(accountId).setbalance(amount);

                        Save.saveTransactionsHistory("Deposit", accounts.get(accountId).getAccountNumber(), amount);
                        break;
                        case 2: 
                            counter = 0;
                        for(Account account : accounts.values()){
                            counter++;
                            System.out.println(counter + ". " +account.getAccountType() + " Account '" + account.getAccountNumber() + "' : " + account.getBalance() + " DH");
                        }
                        int withdaccountId = scan.nextInt();
                        System.out.println("Amount: ");
                        int withdamount = scan.nextInt();
                        if(withdamount <= 0){
                            System.err.println("You Can't Withdrawal This Amount");
                            break;
                        }
                        accounts.get(withdaccountId).withdrawal(withdamount);

                        Save.saveTransactionsHistory("Withdrawal", accounts.get(withdaccountId).getAccountNumber(), withdamount);
                        case 3:
                            break;
                        default:
                        System.out.println("invalid Try Again: ");
                    }
                    break;
                case 3:
                    System.out.println("-------------------- Transfer Between Accounts --------------------");
                    counter = 0;
                    for(Account account : accounts.values()){
                            counter++;
                            System.out.println(counter + ". " + account.getAccountType() + " Account '" + account.getAccountNumber() + "' : " + account.getBalance() + " DH");
                        }
                    System.err.println("Enter Which Account You Want to Transfer Money From: ");
                    int from = scan.nextInt();
                    System.err.println("To: ");
                    int to = scan.nextInt();
                    System.err.println("Amount to Be Transfered: ");
                    int amount = scan.nextInt();

                    transfer(from, to, amount);

                    Save.saveTransactionsHistory("Transfer", accounts.get(from).getAccountNumber(), amount);
                    break;
                case 4: // New Saving/ Account
                    System.err.println("What Account Type Do You Want");
                    System.err.println("1. Saving");
                    System.err.println("2. Spending");
                    int accType = scan.nextInt();
                    if(accType == 1){
                        Account account = new Account("Saving");
                        setAccounts(account);
                        System.out.println("A New Saving Account is Added");
                        break;
                    }else if(accType == 2){
                        Account account = new Account("Spending");
                        setAccounts(account);
                        System.out.println("A New Spending Account is Added");
                        break;
                    }else{
                        System.out.println("Invalid Choice, Try Again");
                        break;
                    }
                    
                case 5: //View Statement
                    counter = 0;

                    System.err.println("-------------------- Choose an Account --------------------");
                        for(Account account : accounts.values()){
                            counter++;
                            System.out.println(counter + ". " + account.getAccountType() + " Account '" + account.getAccountNumber() + "' : " + account.getBalance() + " DH");
                        }
                        int accountId = scan.nextInt();
                        
                    Read.accountStatment(accounts.get(accountId).getAccountNumber());
                    break;

                case 6:
                    exit = false;
                    break;

                default:
                    System.out.println("invalid Try Again: ");
            }
        }
        
    }

    public void editCutomerAccount(String email)
    {
        
    }

}
