package com.yudhobaskoro.sifatPBO;

public class Vehicle {
    private String model;
    private String manufacturer;
    private String engineSize;
    private String has4x4;
    private String type;

    public Vehicle(String model, String manufacturer, String engineSize, String has4x4, String type) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.engineSize = engineSize;
        this.has4x4 = has4x4;
        this.type = type;
    }


    public void fuel(String fuelType){
        System.out.println("refueling with " + fuelType);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getHas4x4() {
        return has4x4;
    }

    public void setHas4x4(String has4x4) {
        this.has4x4 = has4x4;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
