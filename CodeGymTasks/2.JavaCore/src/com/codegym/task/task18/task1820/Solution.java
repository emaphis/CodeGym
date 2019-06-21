package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inFileName = reader.readLine();
            String outFileName = reader.readLine();
            reader.close();;

            BufferedReader fileReader = new BufferedReader(new FileReader(inFileName));
            List<Integer> values = new ArrayList<>();
            String line;
            String[] splitLine;
            while ((line = fileReader.readLine()) != null) {
                splitLine = line.split(" ");
                for (String str : splitLine) {
                    double value = Double.parseDouble(str);
                    int num = (int) Math.round(value);
                    values.add(num);
                }
            }
            fileReader.close();

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outFileName));
            String output = "";
            for (Integer val : values) {
                output += val.toString() + " ";
            }
            fileWriter.write(output);
            fileWriter.close();

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }
}
