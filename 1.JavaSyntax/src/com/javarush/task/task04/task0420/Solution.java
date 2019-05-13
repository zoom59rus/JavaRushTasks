package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine()),
            b = Integer.parseInt(in.readLine()),
            c = Integer.parseInt(in.readLine());
        System.out.println(max(a, b, c));
    }

    public static String max(int a, int b, int c) {
        String result;
        if(a > b)
            if(b > c) result = a + " " + b + " " + c;
            else result = a + " " + c + " " + b;
        else if(b > c)
                if(a < c) result = b + " " + c + " " + a;
                else result = b + " " + a + " " + c;
        else if(a < c)
                if(a < b) result = c + " " + b + " " + a;
                else result = c + " " + a + " " + b;
    }
}
