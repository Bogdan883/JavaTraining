//Ex. 1

package com.lseg.Tema7;

public class Mazda extends Car {

    private String model;

    public Mazda() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void carModel() {
        System.out.println("This is a " + model + " Mazda car with "+getTransmission()+" transmission");
    }
}
