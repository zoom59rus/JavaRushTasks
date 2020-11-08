package com.javarush.task.task24.task2413;

public abstract class BaseObject {
    protected double x;
    protected double y;
    protected double radius;

    abstract void draw(Canvas canvas);

    abstract void move();

    public double getX() {
        return x;
    }

    boolean isIntersec(BaseObject o){
        double distance = java.awt.geom.Point2D.distance(this.x, this.y, o.x, o.y);
        return distance <= Math.max(this.radius, o.radius);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}
