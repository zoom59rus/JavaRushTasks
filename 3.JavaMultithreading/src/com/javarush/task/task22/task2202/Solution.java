package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if(string == null){
            throw new TooShortStringException();
        }

        int count = 0;
        for (int i = -1; i < string.length(); i++) {
            i = string.indexOf(' ', i + 1);
            if(i == -1){
                break;
            }
            count++;
        }

        if(count < 4){
            throw new TooShortStringException();
    }
        StringBuilder sb = new StringBuilder();
        String[] str = string.split(" ");
        for (int i = 1; i < 5; i++) {
            sb.append(str[i] + " ");
        }

        return new String(sb).trim();
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
