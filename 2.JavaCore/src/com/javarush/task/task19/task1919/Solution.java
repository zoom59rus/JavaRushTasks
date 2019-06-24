package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Map<String, Double> lists = new HashMap<String, Double>();
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
            while (bufferedReader.ready()){
                String[] nameValue = bufferedReader.readLine().split(" ");
                String name = nameValue[0];
                double value = Double.parseDouble(nameValue[1]);
                lists.merge(name, value, Double::sum);
            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        Map<String, Double> newLists = new TreeMap<>(lists);
        for(String it : newLists.keySet()){
            System.out.println(it + " " + newLists.get(it));
        }
    }
}
