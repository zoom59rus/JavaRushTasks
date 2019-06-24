package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        BufferedReader reader = null;
        FileReader fileReader = null;
        String forPatter = "";
        try
        {
            reader = new BufferedReader(new InputStreamReader(System.in));
            fileReader = new FileReader(reader.readLine());
            reader.close();
            reader = new BufferedReader(fileReader);
            while (reader.ready()){
                int count = 0;
                String tempLine = reader.readLine();
                for(String it : words){
                    Matcher matcher = Pattern.compile("\\b" + it + "\\b").matcher(tempLine);
                    if(matcher.find()) count++;
                }
                if(count == 2)
                    System.out.println(tempLine);
            }
            reader.close();
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
