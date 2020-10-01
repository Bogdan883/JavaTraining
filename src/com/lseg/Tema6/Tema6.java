package com.lseg.Tema6;

public class Tema6 {
    public static void main(String[] args) {
        //Ex. 1
        //Wall wall = new Wall(5, 4);
        //System.out.println("area= " + wall.getArea());
        //wall.setHeight(-1.5);
        //wall.setWidth(9);
        //System.out.println("width= " + wall.getWidth());
        //System.out.println("height= " + wall.getHeight());
        //System.out.println("area= " + wall.getArea());

        //Ex. 2
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
