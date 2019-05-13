package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = decimal(a);
        if(b > 0 && b < 4 && a >= 1 && a <= 999) {
            if(b == 1) {
                if(0 != (a % 2))
                    System.out.println("нечетное однозначное число");
                else System.out.println("четное однозначное число");
            }
            if(b == 2) {
                if(0 != a % 2)
                    System.out.println("нечетное двузначное число");
                else System.out.println("четное двузначное число");
            }
            if(b == 3) {
                if(0 != a % 2)
                    System.out.println("нечетное трехзначное число");
                else System.out.println("четное трехзначное число");
            }
        }

    }

    public static int decimal(int b) {
        int count = (b == 0) ? 1 : 0;
        while(b > 0) {
            count ++;
            b /= 10;
        }
        return count;
    }
}
