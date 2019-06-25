package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String[] oneFileSplit;
        String twoFile = "";
        FileWriter fileWriter = null;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))){
            fileWriter = new FileWriter(args[1]);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while (bufferedReader.ready()){
                oneFileSplit = bufferedReader.readLine().split(" ");
                for (int i = 0; i < oneFileSplit.length; i++) {
                    if(oneFileSplit[i].length() > 6){
                        twoFile = twoFile + oneFileSplit[i] + ",";
                    }
                }
            }
            twoFile = twoFile.substring(0, twoFile.length() - 1);
            fileWriter.write(twoFile);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}