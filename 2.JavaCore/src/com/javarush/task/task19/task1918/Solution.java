package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        FileReader fileReader;
        String source = "";
        String tag = args[0];
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            fileReader = new FileReader(bufferedReader.readLine());
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.ready())
                source = source + reader.readLine();
            Matcher matcher = Pattern.compile("<" + tag + ">(.|\n)*?</" + tag + ">").matcher(source);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
            fileReader.close();
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
