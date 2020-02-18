package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;

    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void move(){
        for (Horse hors : horses) {
            hors.move();
        }

    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print(){
        for (Horse hors : horses) {
            hors.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public Horse getWinner(){
        Horse winnerHorse = horses.get(0);

        for (int i = 1; i < horses.size(); i++) {
            winnerHorse = winnerHorse.getDistance() > horses.get(i).getDistance() ? winnerHorse : horses.get(i);
        }
        
        return winnerHorse;
    }


    public static void main(String[] args) {
        List<Horse> tmpHorse = new ArrayList<>();
        tmpHorse.add(new Horse("Smerch", 3, 0));
        tmpHorse.add(new Horse("Voronoy", 3, 0));
        tmpHorse.add(new Horse("Mars", 3, 0));

        Hippodrome.game = new Hippodrome(tmpHorse);

        game.run();
        game.printWinner();
    }


}
