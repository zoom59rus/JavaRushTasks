package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, String> it : params.entrySet()){
            if(it.getKey() == null || it.getValue() == null){
                continue;
            }

            sb.append(it.getKey()).append(" = \'").append(it.getValue()).append("\' and ");
        }

        String result = new String(sb);
        if(result.equals("")){
            return result;
        }
        return result.substring(0, result.length() - 5);
    }
}
