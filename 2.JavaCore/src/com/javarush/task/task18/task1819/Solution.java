package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oneFile = null,
                twoFile = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] tempOne = null,
                tempTwo = null,
                tempAll = null;
        try
        {
            oneFile = reader.readLine();
            twoFile = reader.readLine();
            fis = new FileInputStream(oneFile);
            tempOne = new byte[fis.available()];
            fis.read(tempOne);
            fis.close();
            fis = new FileInputStream(twoFile);
            tempTwo = new byte[fis.available()];
            fis.read(tempTwo);
            fis.close();
            fos = new FileOutputStream(oneFile);
            fos.write(tempTwo);
            fos.write(tempOne);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException m) {
            m.printStackTrace();
        }

    }
}
