package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            BufferedReader tt = new BufferedReader(new InputStreamReader(System.in));
            fileReader = new FileReader(tt.readLine());
            tt.close();
            bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()){
                String[] oneLine = bufferedReader.readLine().split("");
                Collections.reverse(Arrays.asList(oneLine));
                System.out.println(String.join("", oneLine));
            }
            fileReader.close();
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
