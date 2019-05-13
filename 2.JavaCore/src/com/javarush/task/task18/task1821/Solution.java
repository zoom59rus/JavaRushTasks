package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        FileInputStream fis = null;
        char[] sim = null;
        try
        {
            fis = new FileInputStream(args[0]);
            sim = new char[fis.available()];
            while (fis.available() > 0)
                sim[fis.read()]++;
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < sim.length; i++) {
            if (sim[i] > 0) System.out.println((char) i + " " + (int) sim[i]);

        }

    }
}
