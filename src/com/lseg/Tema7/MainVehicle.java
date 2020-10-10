//Ex. 1

package com.lseg.Tema7;

public class MainVehicle {

    public static void main(String[] args) {

        Mazda Mazda_6 = new Mazda();
        Mazda_6.setModel("Mazda6");
        Mazda_6.setTopSpeed(240);
        System.out.println("Mazda model: " + Mazda_6.getModel());
        System.out.println("Top speed for " + Mazda_6.getModel() + " is " + Mazda_6.getTopSpeed());
        Mazda_6.moving();
        Mazda_6.setTransmission("automatic");
        Mazda_6.changingGears();
        Mazda_6.carModel();
    }

}
