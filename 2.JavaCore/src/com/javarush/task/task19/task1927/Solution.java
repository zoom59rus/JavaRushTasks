package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newStream);
        testString.printSomething();
        System.setOut(consoleStream);
        String[] testStringSplit = byteArrayOutputStream.toString().split("\n");
        for (int i = 0, c = 0; i < testStringSplit.length; i++) {
            if(c == 2){
                System.out.println("JavaRush - курсы Java онлайн");
                c = 0;
            }
            System.out.println(testStringSplit[i]);
            c++;
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
