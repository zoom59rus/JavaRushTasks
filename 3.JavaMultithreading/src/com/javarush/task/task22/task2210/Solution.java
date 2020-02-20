package com.javarush.task.task22.task2210;

import java.util.*;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        List<String> lists = new ArrayList<>();
        while (st.hasMoreTokens()){
            lists.add(st.nextToken());
        }
        String[] result = new String[lists.size()];
        return lists.toArray(result);
    }
}