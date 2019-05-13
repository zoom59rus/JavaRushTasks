package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ThreadFive extends Thread {

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        try
        {
            String word = reader.readLine();
            while (!word.equals("N")) {
                sum = sum + Integer.parseInt(word);
                word = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}
