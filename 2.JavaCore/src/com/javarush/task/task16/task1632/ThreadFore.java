package com.javarush.task.task16.task1632;

public class ThreadFore extends Thread implements Message {

    public boolean run = false;

    public void showWarning() {
        run = true;
    }

    public void run() {
        while (!run) {

        }

        Thread.interrupted();
    }
}
