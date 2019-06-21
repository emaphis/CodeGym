package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        File file = new File(args[0]);
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        SortedMap<Integer,Integer> freqMap = new TreeMap<>();

        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            int num;
            while ((num = bufferedReader.read())!=-1){
                if(freqMap.containsKey(num)){
                    freqMap.replace(num,(freqMap.get(num)+1));
                }else{
                    freqMap.put(num,1);  // new symbol
                }
            }

            for (Map.Entry<Integer,Integer> entry: freqMap.entrySet()) {
                System.out.println(((char)entry.getKey().intValue())+ " " + entry.getValue());
            }

            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
