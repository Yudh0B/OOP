package com.yudhobaskoro.sifatPBO;

public class Truck extends Vehicle{

    private String tubType;

    public Truck(String model, String manufacturer, String engineSize, String has4x4, String type, String tubType) {
        super(model, manufacturer, engineSize, has4x4, type);
        this.tubType = tubType;
    }

    @Override
    public void fuel(String fuelType) {
        System.out.println(getModel() + " Diisi dengan " + fuelType);
    }

    public void offroad () {
        System.out.println(this.getModel() + " capable untuk offroad");
    }



    public String getTubType() {
        return tubType;
    }

    public void setTubType(String tubType) {
        this.tubType = tubType;
    }
}
