package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static BufferedReader reader = null;
    public static FileReader fReader = null;
    public static FileWriter fWriter = null;
    public static int count = 1;

    public static void main(String[] args) {

        reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            fReader = new FileReader(reader.readLine());
            fWriter = new FileWriter(reader.readLine());
            while(fReader.ready()){
                int temp = fReader.read();
                if(count % 2 == 0)
                    fWriter.write(temp);
                count++;
            }
            reader.close();
            fReader.close();
            fWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
