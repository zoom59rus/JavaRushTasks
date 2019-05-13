package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double average = 0, tmp = 0;
        int count = 0;
        for (;;++count) {
            tmp = Double.parseDouble(in.readLine());
            if(tmp == -1)
                break;
            else average += tmp;
        }
        System.out.println(average / count);
    }
}

