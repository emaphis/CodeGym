package com.codegym.task.task18.task1827;

/* 
Prices

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length < 4) return;
        String command = args[0];
        String newDescription = args[1];
        String newPrice = args[2];
        String newQuantity = args[3];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        List<String> lines = new ArrayList<>();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            while (fileReader.ready()) {
                //System.out.println("got here ....");
                String line = fileReader.readLine();
                lines.add(line);
            }
            fileReader.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

        // calculate new ID
        List<Integer> ids = new ArrayList<>();
        for (String line : lines) {
       //     System.out.println(line.substring(0,8).trim());
            int id = Integer.parseInt(line.substring(0, 8).trim());
            ids.add(id);
        }
        int newID = Collections.max(ids) + 1;
        //System.out.println("New ID: " + newID);

        if (command.equals("-c")) {
            StringBuilder builder = new StringBuilder();
            String ID = "" + newID;
            builder.append(String.format("%-8s", ID));
            builder.append(String.format("%-30s", newDescription));
            builder.append(String.format("%-8s", newPrice));
            builder.append(String.format("%-4s", newQuantity));
            //System.out.println(builder.toString());

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.newLine();
            writer.write(builder.toString());
            writer.close();
        }

        //System.out.println("number: " + lines.size());
        //for (String line : lines) {
           // int id =  Integer.parseInt(line.substring(0, 8).trim());
           // String description = line.substring(8,38).trim();
           // double price = Double.parseDouble(line.substring(38, 46).trim());
           // int quantity = Integer.parseInt(line.substring(46).trim());
           // System.out.println(id + " : " + description + " : " + price + " : " + quantity);
            //System.out.println(line);
        //}
    }
}
