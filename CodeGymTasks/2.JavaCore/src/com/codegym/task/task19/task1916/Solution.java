package com.codegym.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Tracking changes

*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader readerFile1 = new BufferedReader(new FileReader(fileName1));
        String line;
        List<String> list1 = new ArrayList<>();
        while (readerFile1.ready()) {
            line = readerFile1.readLine();
            list1.add(line);
        }
        readerFile1.close();

        BufferedReader readerFile2 = new BufferedReader(new FileReader(fileName2));
        List<String> list2 = new ArrayList<>();
        while (readerFile2.ready()) {
            line = readerFile2.readLine();
            list2.add(line);
        }
        readerFile2.close();

        int lineCount1 = 0;
        int lineCount2 = 0;

        // walk both lists
        while (lineCount1 < list1.size() && lineCount2 < list2.size()) {
            String line1 = list1.get(lineCount1);
            String line2 = list2.get(lineCount2);

            if (line1.equals(line2)) {
                lines.add(new LineItem(Type.SAME, line1));
                lineCount1++;
                lineCount2++;
            }
        }
    }

    public static enum Type {
        ADDED,        // New line added
        REMOVED,      // Line deleted
        SAME          // No change
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
