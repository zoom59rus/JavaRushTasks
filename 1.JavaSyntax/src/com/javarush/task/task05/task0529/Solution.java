package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String line = in.readLine();
        while(!line.equals("сумма")) {
            sum += Integer.parseInt(line);
            line = in.readLine();
        }
        System.out.println(sum);
    }
}
