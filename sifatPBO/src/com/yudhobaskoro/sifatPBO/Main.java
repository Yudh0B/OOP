package com.yudhobaskoro.sifatPBO;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Truck Dutro110 = new Truck("Dutro 130 HD 4x4", "Hino", "4009", "4x4", "Medium Duty", "Box");
        Car Rocky = new Car("Rocky", "Daihatsu", "999", "4x2", "Small crossover", "Hatchback");
        Truck Canter = new Truck("FE71", "Mitsubishi", "3908", "4x2", "Light Duty", "Box");
        Car Triton = new Car("Triton Ultimate", "Mitsubishi", "2442", "4x4", "Double Cabin", "Bed");

        System.out.println("");
        System.out.println(Dutro110.getModel());
        System.out.println("Produsen :" + Dutro110.getManufacturer());
        System.out.println("Besar Mesin : " + Dutro110.getEngineSize() + "cc");
        System.out.println("Tipe Penggerak : " + Dutro110.getHas4x4());
        System.out.println("Tipe : " + Dutro110.getType() + " Truck");
        System.out.println("Tipe Bak : " + Dutro110.getTubType());
        Dutro110.fuel("Diesel");
        if (Dutro110.getHas4x4() == "4x4") {
            Dutro110.offroad();
        }else{
            System.out.println(Dutro110.getModel() + " tidak capable untuk offroad");
        }

        System.out.println("");
        System.out.println(Rocky.getModel());
        System.out.println("Produsen :" + Rocky.getManufacturer());
        System.out.println("Besar Mesin : "+ Rocky.getEngineSize() + "cc");
        System.out.println("Tipe Penggerak : " + Rocky.getHas4x4());
        System.out.println("Tipe : " + Rocky.getType() + " Car");
        System.out.println("Tipe Bak : " + Rocky.getTrunkType());
        Rocky.fuel("Bensin");
        if (Rocky.getHas4x4() == "4x4") {
            Rocky.offroad();
        }else{
            System.out.println(Rocky.getModel() + " tidak capable untuk offroad");
        }

        System.out.println("");
        System.out.println(Canter.getModel());
        System.out.println("Produsen :" + Canter.getManufacturer());
        System.out.println("Besar Mesin : "+ Canter.getEngineSize() + "cc");
        System.out.println("Tipe Penggerak : " + Canter.getHas4x4());
        System.out.println("Tipe : " + Canter.getType() + " Truck");
        System.out.println("Tipe Bak : " + Canter.getTubType());
        Canter.fuel("Diesel");
        if (Canter.getHas4x4() == "4x4") {
            Canter.offroad();
        }else{
            System.out.println(Canter.getModel() + " tidak capable untuk offroad");
        }

        System.out.println("");
        System.out.println(Triton.getModel());
        System.out.println("Produsen :" + Triton.getManufacturer());
        System.out.println("Besar Mesin : "+ Triton.getEngineSize() + "cc");
        System.out.println("Tipe Penggerak : " + Triton.getHas4x4());
        System.out.println("Tipe : " + Triton.getType() + " Car");
        System.out.println("Tipe Bak : " + Triton.getTrunkType());
        Triton.fuel("Diesel");
        if (Triton.getHas4x4() == "4x4") {
            Triton.offroad();
        }else{
            System.out.println(Triton.getModel() + " tidak capable untuk offroad");
        }

    }
}
