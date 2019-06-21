package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String string = byteArrayOutputStream.toString();
        System.setOut(consoleStream);
        if(string.contains("+"))
            System.out.println(string + (3 + 6));
        if(string.contains("-"))
            System.out.println(string + (3 - 6));
        if(string.contains("*"))
            System.out.println(string + (3 * 6));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

