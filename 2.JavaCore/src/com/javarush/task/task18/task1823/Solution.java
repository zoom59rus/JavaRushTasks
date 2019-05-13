package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, FileNotFoundException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileN = reader.readLine();
        while (!fileN.equals("exit")) {
            new ReadThread(fileN).start();
            fileN = reader.readLine();
        }
    }

    public static class ReadThread extends Thread{
        private byte[] enu = null;
        private FileInputStream fis = null;

        public ReadThread(String fileName) throws FileNotFoundException {
            this.setName(fileName);
            this.fis = new FileInputStream(fileName);
            this.enu = new byte[128];
        }

        public void run() {
            try
            {
                while (fis.available() > 0) {
                    enu[fis.read()]++;
                }
                int max = enu[0];
                for (int i = 0; i < enu.length; i++) {
                    if (enu[max] < enu[i]) max = i;
                }
                synchronized (this) {
                    resultMap.put(this.getName(), max);
                }
                fis.close();
            } catch (IOException e) {
            }
        }
    }
}