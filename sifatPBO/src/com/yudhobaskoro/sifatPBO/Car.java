package com.yudhobaskoro.sifatPBO;

public class Car extends Vehicle {

    private String trunkType;

    public Car(String model, String manufacturer, String engineSize, String has4x4, String type, String trunkType) {
        super(model, manufacturer, engineSize, has4x4, type);
        this.trunkType = trunkType;
    }

    public String getTrunkType() {
        return trunkType;
    }

    public void fuel(String fuelType) {
        System.out.println(getModel() + " Diisi Dengan " + fuelType);
    }

    public void offroad () {
        System.out.println(this.getModel() + " capable untuk offroad");
    }

    public void setTrunkType(String trunkType) {
        this.trunkType = trunkType;
    }
}
