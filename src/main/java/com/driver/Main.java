package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", true);
        mercedes.move(40, 20);
        mercedes.move(20,40);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }

}