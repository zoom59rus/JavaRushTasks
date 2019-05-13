package com.javarush.task.task16.task1632;

public class ThreadTree extends Thread {

    public void run() {
        try
        {
            while (true) {
                System.out.println("Ура");
                sleep(500);
            }
        } catch (InterruptedException e) {

        }
    }
}
