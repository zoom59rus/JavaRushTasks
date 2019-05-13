package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = null;
        while (true) {
            try {
                fis = new FileInputStream(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis.available() < 1000) {
                    throw new DownloadException();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
