package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if(3  <= month && month <= 5)
        System.out.println("весна");
            else if(6 <= month && month <= 8)
                System.out.println("лето");
                    else if(9 <= month && month <= 11)
                        System.out.println("осень");
        else System.out.println("зима");
    }
}