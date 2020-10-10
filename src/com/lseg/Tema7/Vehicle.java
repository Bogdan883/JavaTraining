//Ex. 1

package com.lseg.Tema7;

public class Vehicle {


    private int numberOfWheels;
    private int topSpeed;

    public Vehicle() {
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void moving() {
        System.out.println("The vehicle is moving with a top speed of " + topSpeed + " km/h");
    }
}
