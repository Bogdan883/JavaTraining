//Ex. 1
package com.lseg.Tema8;

public class Appliances {

    private Fridge fridge;
    private GasCooker gasCooker;
    private Microwave microwave;
    private Stove stove;

    public Appliances(Fridge fridge, GasCooker gasCooker, Microwave microwave, Stove stove) {
        this.fridge = fridge;
        this.gasCooker = gasCooker;
        this.microwave = microwave;
        this.stove = stove;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public GasCooker getGasCooker() {
        return gasCooker;
    }

    public Microwave getMicrowave() {
        return microwave;
    }

    public Stove getStove() {
        return stove;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public void setGasCooker(GasCooker gasCooker) {
        this.gasCooker = gasCooker;
    }

    public void setMicrowave(Microwave microwave) {
        this.microwave = microwave;
    }

    public void setStove(Stove stove) {
        this.stove = stove;
    }
}
