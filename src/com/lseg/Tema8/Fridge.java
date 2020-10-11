//Ex. 1
package com.lseg.Tema8;

public class Fridge extends ProductDetails {

    public Fridge(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public void useFridge() {
        System.out.println("Fridge in use");
    }
}
