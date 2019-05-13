package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static
    {
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThreadTree());
        threads.add(new ThreadFore());
        threads.add(new ThreadFive());
    }

    public static void main(String[] args) {
    }



}