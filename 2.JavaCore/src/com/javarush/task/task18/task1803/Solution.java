package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        long[] array = new long[256];
        while (fis.available() > 0) {
            array[fis.read()]++;
        }
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxCount) maxCount = (int) array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxCount) System.out.print(i + " ");
        }
        fis.close();
    }
}