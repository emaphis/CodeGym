package com.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // get file names
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        // open then read in files
        BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1));
        String input;
        while ((input = fileReader1.readLine()) != null) {
            allLines.add(input);
        }
        fileReader1.close();

        BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2));
        while ((input = fileReader2.readLine()) != null) {
            linesForRemoval.add(input);
        }
        fileReader2.close();

        // now process data
        try {
            Solution process = new Solution();
            process.joinData();
        } catch (CorruptedDataException ex) {
            System.out.println(ex.toString());
        }

    }

    public void joinData() throws CorruptedDataException {
        // test if lines of removal are in data
        if (allLines.containsAll(linesForRemoval)) {
            List<String> copy = allLines;
            // remove lines
            copy.removeAll(linesForRemoval);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
