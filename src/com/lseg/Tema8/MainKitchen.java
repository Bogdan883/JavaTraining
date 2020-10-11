//Ex.1
package com.lseg.Tema8;

public class MainKitchen {
    public static void main(String[] args) {
        Table table1 = new Table(1.4, 1.2, "rectangular", "black");
        Chairs chairs1 = new Chairs("white", "wood");
        Microwave microwave1 = new Microwave("Samsung", "M275");
        GasCooker gasCooker1 = new GasCooker("Ariston", "G450");
        Stove stove1 = new Stove("Franke", "S780");
        Fridge fridge1 = new Fridge("LG", "F1050");
        Furniture furniture1 = new Furniture(chairs1, table1);
        Appliances appliances1 = new Appliances(fridge1, gasCooker1, microwave1, stove1);
        Kitchen kitchen1 = new Kitchen(appliances1, furniture1);

        kitchen1.enterKitchen();
        kitchen1.componentsKitchen();
        System.out.println("Table area is "+table1.getTableArea()+ " square meters");
        kitchen1.useKitchen();

    }
}
