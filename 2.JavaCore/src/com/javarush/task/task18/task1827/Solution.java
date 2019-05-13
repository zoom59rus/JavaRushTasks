package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) System.exit(0);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //byte[] id = fill32(8, String id);
        byte[] productName = fill32(30, args[1]);
        byte[] price = fill32(8, args[2]);
        byte[] quantity = fill32(4, args[3]);
        List<String> lists = new ArrayList<>();
        Scanner sc = new Scanner(fileName);
        while (sc.hasNext()) {

        }
        try
        {

        } catch (FileNotFoundException e) {
        }
    }

    public static byte[] fill32(int size, String value) {
        byte[] temp = new byte[size];
        byte[] tTemp = value.getBytes();
        for (int i = 0; i < tTemp.length; i++) {
            temp[i] = tTemp[i];
        }
        for (int i = tTemp.length; i < temp.length; i++) {
            temp[i] = 32;
        }
        return temp;
    }
}