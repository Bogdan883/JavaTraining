

package com.lseg.Tema6;

//Ex. 1
public class Wall {

    private double width;
    private double height;

    //default constructor
    public Wall() {
    }

    //explicit constructor
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //getWidth without any parameters,
    public double getWidth() {
        return width;
    }

    //getHeight without any parameters,
    public double getHeight() {
        return height;
    }

    //setWidth with one parameter of type double
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //setHeight with one parameter of type double
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //getArea without any parameters
    public double getArea() {
        return this.height * this.width;
    }
}