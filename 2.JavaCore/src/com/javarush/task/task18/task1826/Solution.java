package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    private static int key = 10;

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] buffer = null;
        try
        {
            fis = new FileInputStream(args[1]);
            buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
        } catch (FileNotFoundException e) {
        }
        if (args[0].equals("-e")) {
            try
            {
                fos = new FileOutputStream(args[2]);
                fos.write(encodeDecode(buffer));
            } catch (FileNotFoundException e) {
            }
            fos.close();
        }

        if (args[0].equals("-d")) {
            try
            {
                fos = new FileOutputStream(args[2]);
                fos.write(encodeDecode(buffer));
            } catch (FileNotFoundException e) {
            }
            fos.close();
        }
    }

    public static byte[] encodeDecode(byte[] buffer) {
        byte[] temp = new byte[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            temp[i] = (byte) (buffer[i] ^ key);
        }
        return temp;
    }

}
