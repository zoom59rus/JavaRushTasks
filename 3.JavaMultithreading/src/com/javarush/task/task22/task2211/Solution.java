package com.javarush.task.task22.task2211;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File(args[0]));
        byte[] b = new byte[fis.available()];
        fis.read(b);
        String tmp = new String(b, "WINDOWS-1251");
        b = tmp.getBytes("UTF-8");

        FileOutputStream fos = new FileOutputStream(new File(args[1]));
        fos.write(b);
    }
}
