package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws  IOException {

        TreeMap<Integer,String> fileMap = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName;
        while (!(fileName = reader.readLine()).equals("end")){
            String n = fileName.substring(fileName.lastIndexOf(".part") + 5);
            fileMap.put(Integer.parseInt(n), fileName);
        }
        reader.close();

        File aFile = new File(fileMap.firstEntry().getValue());
        String outFileName = aFile.getPath().substring(0, aFile.getPath().lastIndexOf("."));

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(outFileName)));

        for(Map.Entry<Integer,String> entry: fileMap.entrySet()){
            File file = new File(entry.getValue());
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            int i;
            while ((i = inputStream.read()) != -1){
                outputStream.write(i);
            }
            inputStream.close();
        }
        outputStream.close();
     }
}
