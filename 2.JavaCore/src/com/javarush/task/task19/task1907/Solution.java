package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static BufferedReader reader = null;
    public static FileReader fReader = null;
    public static Scanner scanner = null;

    public static void main(String[] args) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        int result = 0;
        try
        {
            fReader = new FileReader(reader.readLine());
            scanner = new Scanner(fReader);
            while (scanner.hasNext()){
                string += scanner.nextLine();
            }

            Pattern pattern = Pattern.compile("[^\\w][Ww][oO][rR][lL][dD][^\\w]*");
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()){
                result++;
            }
            System.out.println(result);
            reader.close();
            fReader.close();
            scanner.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
