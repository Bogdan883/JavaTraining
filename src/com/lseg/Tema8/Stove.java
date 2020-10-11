//Ex. 1
package com.lseg.Tema8;

public class Stove extends ProductDetails {

    private double maxTemperature;

    public Stove(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public void useStove() {
        System.out.println("Stove in use");
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
