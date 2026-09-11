package org.example.nexabank.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Saa {

    public static void savee(){
        HashMap<String, String> customers = new HashMap<>();

        customers.put("01", "Mouad");
        customers.put("02", "Ahmed");
        customers.put("03", "Yassine");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("testing.txt"));
        
            for(Map.Entry<String, String> entry : customers.entrySet()){
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }

            writer.close();
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void read(){
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("testing.txt")
            );
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
