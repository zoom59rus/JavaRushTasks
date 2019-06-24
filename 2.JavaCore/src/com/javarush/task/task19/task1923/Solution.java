package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try
        {
            bufferedReader = new BufferedReader(new FileReader(args[0]));
            bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
            while(bufferedReader.ready()){
                String[] tempLine = bufferedReader.readLine().split(" ");
                //Matcher matcher = Pattern.compile("\\d+").matcher(tempLine);
                for (int i = 0; i < tempLine.length; i++) {
                    Matcher matcher = Pattern.compile("\\d").matcher(tempLine[i]);
                    if(matcher.find())
                        bufferedWriter.write(tempLine[i] + " ");
                }
            }
            bufferedReader.close();
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}