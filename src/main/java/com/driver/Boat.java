package com.driver;
public class Boat implements WaterVehicle {
    private String name = "ChalwaHaiHamara";
    private int capacity = 100;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        System.out.println(this.name);
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        System.out.println(this.capacity);
        return this.capacity;
    }
}
