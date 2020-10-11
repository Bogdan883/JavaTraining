//Ex. 1
package com.lseg.Tema8;

public class Table {
    private double length;
    private double width;
    private String shape;
    private String color;

    public Table(double length, double width, String shape, String color) {
        this.length = length;
        this.width = width;
        this.shape = shape;
        this.color = color;
    }

    public double getTableArea(){
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
