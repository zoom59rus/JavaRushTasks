package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        Map<String, Double> lists = new HashMap<>();
        try
        {
            bufferedReader = new BufferedReader(new FileReader(args[0]));
            while (bufferedReader.ready()){
                String[] line = bufferedReader.readLine().split(" ");
                lists.merge(line[0], Double.parseDouble(line[1]), Double::sum);
            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        Stream<Map.Entry<String, Double>> sorted = lists.entrySet().stream().sorted(Map.Entry.comparingByValue());

    }
}
