package com.lseg.Tema6;

//Ex. 2
public class Point {

    private int x;
    private int y;

    //default constructor
    public Point() {

    }

    //explicit constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getX without any parameters
    public int getX() {
        return x;
    }

    //getY without any parameters
    public int gety() {
        return y;
    }

    //setX with one parameter of type int
    public void setX(int x) {
        this.x = x;
    }

    //setY with one parameter of type int
    public void setY(int y) {

    }

    //distance without any parameters
    public double distance() {
        return Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
    }

    //named distance with parameter another of type Point
    public double distance(Point another) {
        return Math.sqrt((x - another.x) * (x - another.x) + (y - another.y) * (y - another.y));

    }
}
