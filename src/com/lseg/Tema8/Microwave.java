//Ex. 1
package com.lseg.Tema8;

public class Microwave extends ProductDetails {

    public Microwave(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public void useMicrowave() {
        System.out.println("Microwave in use");
    }
}
