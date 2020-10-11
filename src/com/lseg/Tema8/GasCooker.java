//Ex. 1
package com.lseg.Tema8;

public class GasCooker extends ProductDetails {

    public GasCooker(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public void useGasCooker() {
        System.out.println("Gas Cooker in use");
    }
}
