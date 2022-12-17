package com.driver;
public class Boat implements WaterVehicle {
    private String name ;
    private int capacity;


    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        System.out.println(this.name);
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getVehicleCapacity() {
        System.out.println(this.capacity);
        return this.capacity;
    }
}
