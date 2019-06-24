package com.javarush.task.task19.task1916;

import sun.net.ftp.FtpDirEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Scanner ferstFile = new Scanner(new FileReader(bufferedReader.readLine()));
            Scanner lastFile = new Scanner(new FileReader(bufferedReader.readLine()));
            bufferedReader.close();

            while (ferstFile.hasNextLine() || lastFile.hasNextLine()){
                String oneLine = ferstFile.nextLine();
                String twoLine = lastFile.nextLine();
                if(oneLine.equals(twoLine)){
                    lines.add(new LineItem(Type.SAME, oneLine));
                }
                if(twoLine.isEmpty()){
                    lines.add(new LineItem(Type.REMOVED, oneLine));
                }
                if(oneLine.isEmpty() && !twoLine.isEmpty()){
                    lines.add(new LineItem(Type.ADDED, twoLine));
                }
                if(oneLine.isEmpty()){
                    lines.add(new LineItem(Type.REMOVED, oneLine));
                }
            }
            ferstFile.close();
            lastFile.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
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
