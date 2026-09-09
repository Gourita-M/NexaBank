package org.example.nexabank.main;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("-------------------- Welcome To NexaBank --------------------");
        System.out.println("1. Login to The Platform");
        System.out.println("2. About Us");
        System.out.println("3. Exit");


        scan.close();
    }

}
