package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream consoleOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String string = byteArrayOutputStream.toString();
        System.setOut(consoleOut);
        try {
            FileOutputStream fis = new FileOutputStream(new File(bufferedReader.readLine()));
            fis.write(string.getBytes());
            System.out.println(string);
            bufferedReader.close();
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

