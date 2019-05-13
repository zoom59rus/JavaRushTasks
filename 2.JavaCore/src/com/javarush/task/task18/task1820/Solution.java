package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = null;
        byte[] temp = null;
        PrintWriter pw = null;
        try
        {
            fis = new FileInputStream(reader.readLine());
            pw = new PrintWriter(reader.readLine());
            temp = new byte[fis.available()];
            fis.read(temp);
            fis.close();
            String line = new String(temp);
            String[] li = line.split(" ");
            for (int i = 0; i < li.length; i++) {
                float f = Float.parseFloat(li[i]);
                pw.print(okr(f) + " ");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException m) {
            m.printStackTrace();
        }
    }

    public static int okr(float decimal) {
        int temp = (int) decimal;
        if (decimal % 1 == 0) return temp;
        else if (decimal * -1 < 0) {
            if(decimal % 1 < 0.50) return temp;
            else return temp + 1;
        }
        else if (decimal * -1 > 0) {
            if (decimal % 1 >= -0.50) return temp;
            else return temp + (-1);
        }
        return temp;
    }
}
