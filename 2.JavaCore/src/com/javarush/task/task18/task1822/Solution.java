package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.Scanner;
import java.lang.String;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        Scanner sc = new Scanner(fis);
        while (sc.hasNext()) {
            String tempLine = sc.nextLine();
            if(tempLine.startsWith(args[0] + " ")) {
                String[] line = tempLine.split(" ");
                System.out.print(line[0] + " ");
                for (int i = 1; i < line.length - 2; i++) {
                    System.out.print(line[i] + " ");
                }
                System.out.print(Double.parseDouble(line[line.length - 2]) + " ");
                System.out.print(Integer.parseInt(line[line.length-1]));
            }
        }
        sc.close();
    }
}