package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        byte a = 0, b = 127;
        while (fis.available() > 0) {
            a = (byte) fis.read();
            b = b < a ? b : a;
        }
        fis.close();
        reader.close();
        System.out.println(b);
    }
}
