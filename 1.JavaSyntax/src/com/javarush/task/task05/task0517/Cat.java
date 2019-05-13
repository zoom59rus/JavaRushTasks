package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Cat(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 5;
        this.color = "green";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "blu";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 6;
        this.color = "black";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 4;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;
    }

    public static void main(String[] args) {

    }
}
