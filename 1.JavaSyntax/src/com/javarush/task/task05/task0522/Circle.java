package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;



    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x) {
        this.x = x;
        this.y = 5;
        this.radius = 9;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 25;
    }

    public Circle() {

    }

    public static void main(String[] args) {

    }
}