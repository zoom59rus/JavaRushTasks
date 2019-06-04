package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;

public class Solution {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        String string = "";
        BufferedWriter writer = null;

        try
        {
            BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
            fileReader = new FileReader(reader.readLine());
            fileWriter = new FileWriter(reader.readLine());
            reader.close();
            reader = new BufferedReader(fileReader);
            string = reader.readLine();
            reader.close();
            fileReader.close();
            writer = new BufferedWriter(fileWriter);
            Pattern pattern = Pattern.compile("\\b[0-9]+\\b");
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()){
                writer.write(string.substring(matcher.start(), matcher.end()) + " ");
            }
            fileWriter.close();
            writer.close();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
