package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import static java.lang.Math.sqrt;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(in.readLine());

        if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0)
            System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");
    }
}