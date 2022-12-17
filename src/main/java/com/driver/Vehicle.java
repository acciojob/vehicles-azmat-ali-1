package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;



    private int currentDirection;

    private boolean isMove = false;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        //this.currentDirection+= direction;
        setCurrentDirection(direction);
        System.out.println("steer method called - The direction is changed to: " + getCurrentDirection()+ " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.isMove=true;
        setCurrentSpeed(speed);
      setCurrentDirection(direction);
        System.out.println("move method called - The speed is changed to: " + getCurrentSpeed() + ", and the direction is changed to: " + getCurrentDirection() + " degrees");

    }
//    public int speed(int speed){
//        this.currentSpeed+=speed;
//        return this.currentSpeed;
//    }

    public void stop(){
            this.currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public boolean isMove() {
        return isMove;
    }
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed += currentSpeed;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection+= currentDirection;
    }
}
