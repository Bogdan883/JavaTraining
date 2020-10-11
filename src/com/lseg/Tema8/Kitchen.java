//Ex. 1
package com.lseg.Tema8;

public class Kitchen {

    private Appliances appliances;
    private Furniture furniture;

    public Kitchen(Appliances appliances, Furniture furniture) {
        this.appliances = appliances;
        this.furniture = furniture;
    }


    public void useKitchen(){
        appliances.getFridge().useFridge();
        appliances.getMicrowave().useMicrowave();
        appliances.getStove().useStove();
        appliances.getGasCooker().useGasCooker();

    }

    public void enterKitchen() {
        System.out.println("Enter the kitchen.");
    }

    public void componentsKitchen() {
        System.out.println("This kitchen comes with furniture and appliances.");
    }

    public Appliances getAppliances() {
        return appliances;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setAppliances(Appliances appliances) {
        this.appliances = appliances;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }
}
