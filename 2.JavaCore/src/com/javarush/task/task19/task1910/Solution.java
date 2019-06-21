package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try
        {
            reader = new BufferedReader(new InputStreamReader(System.in));
            fileReader = new FileReader(reader.readLine());
            fileWriter = new FileWriter(reader.readLine());
            reader.close();
            reader = new BufferedReader(fileReader);
            writer = new BufferedWriter(fileWriter);
            while (reader.ready()){
                String tempString = reader.readLine();
                tempString = tempString.replaceAll("\\p{Punct}|\\n", "");
                writer.write(tempString);
            }
            fileReader.close();
            fileWriter.close();
            reader.close();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
