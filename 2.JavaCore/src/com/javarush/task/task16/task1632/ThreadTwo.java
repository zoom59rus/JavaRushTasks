package com.javarush.task.task16.task1632;


public class ThreadTwo extends Thread {

    public void run() {
        try
        {
            sleep(1);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}
