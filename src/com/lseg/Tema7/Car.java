//Ex. 1

package com.lseg.Tema7;

public class Car extends Vehicle {

    private String direction;
    private String transmission;

    public Car() {
    }

    public String getDirection() {
        return direction;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void steering() {
        System.out.println("The car has " + direction + " steering");
    }

    public void changingGears() {
        System.out.println("The car uses " + transmission + " transmission for changing gears");
    }

}
