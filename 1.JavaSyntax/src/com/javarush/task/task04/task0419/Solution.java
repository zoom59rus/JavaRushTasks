package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine()),
            b = Integer.parseInt(in.readLine()),
            c = Integer.parseInt(in.readLine()),
            d = Integer.parseInt(in.readLine());
        a = (a > b ? a : b);
        c = (c > d ? c : d);
        System.out.println(a > c ? a : c);
    }
}
