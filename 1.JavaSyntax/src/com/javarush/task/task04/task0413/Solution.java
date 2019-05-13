package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        String[] week = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if(1 <= num && num <= 7)
            System.out.println(week[num -1]);
        else System.out.println("такого дня недели не существует");

    }
}