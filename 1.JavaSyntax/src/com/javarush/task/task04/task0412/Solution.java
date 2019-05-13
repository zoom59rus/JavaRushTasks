package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());

        if(num == 0)
            System.out.println(num);
        else if(num > 0)
            System.out.println(num * 2);
        else System.out.println(num += 1);

    }

}