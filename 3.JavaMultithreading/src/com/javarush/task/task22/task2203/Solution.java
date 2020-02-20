package com.javarush.task.task22.task2203;

import java.util.Arrays;

/*
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if(string == null){
            throw new TooShortStringException();
        }
        int count = 0;
        for (int i = -1; i < string.length(); i++) {
            i = string.indexOf('\t', i +1);
            if(i == -1){
                break;
            }
            count++;
        }

        if(count < 2){
            throw new TooShortStringException();
        }
        String[] tmpString = string.split("\t");

        return tmpString[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
