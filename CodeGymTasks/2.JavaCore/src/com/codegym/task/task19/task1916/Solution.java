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
        List<String> fileList1 = new ArrayList<>();
        while (readerFile1.ready()) {
            line = readerFile1.readLine();
            fileList1.add(line);
        }
        readerFile1.close();

        BufferedReader readerFile2 = new BufferedReader(new FileReader(fileName2));
        List<String> fileList2 = new ArrayList<>();
        while (readerFile2.ready()) {
            line = readerFile2.readLine();
            fileList2.add(line);
        }
        readerFile2.close();

        int index1 = 0;
        int index2 = 0;

        // walk both lists
        while (index1 < fileList1.size() && index2 < fileList2.size()) {

            if (fileList1.get(index1).equals(fileList2.get(index2))) {
                lines.add(new LineItem(Type.SAME, fileList1.get(index1)));
                index1++;
                index2++;
            } else if (fileList2.size() > index2 + 1 && fileList2.get(index2 + 1).equals(fileList1.get(index1))) {
                lines.add(new LineItem(Type.ADDED, fileList2.get(index2)));
                index2++;
            } else if (fileList1.size() > index1 + 1 && fileList1.get(index1 + 1).equals(fileList2.get(index2))) {
                lines.add(new LineItem(Type.REMOVED, fileList1.get(index1)));
                index1++;
            }
        }

        // check for one file longer then then other.
        if (index2 < fileList2.size()) {
            lines.add(new LineItem(Type.ADDED, fileList2.get(index2)));
        }
        if (index1 < fileList1.size()) {
            lines.add(new LineItem(Type.REMOVED, fileList1.get(index1)));
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
