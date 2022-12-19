package com.driver;

public class F1 extends Car {

    private boolean isManual;
    public F1(String name, boolean isManual) {
        super(name,4,4,6,isManual,"name",4);
        //Use arbitrary values for parameters which are not mentioned
    }


    public void accelerate(int rate){
         //set the value of new speed by using currentSpeed and rate


        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        //System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);
        int newSpeed = rate+getCurrentSpeed();
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);

        }
        //for all other cases, change the gear accordingly

        if(newSpeed >250) {
            changeGear(6);
            //System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        else if(newSpeed >200) {
            changeGear(5);
           // System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        else if(newSpeed >150) {
            changeGear(4);
            //System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        else if(newSpeed >100) {
            changeGear(3);
            //System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        else if(newSpeed >50) {
            changeGear(5);
            //System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        if(newSpeed>0) {
            changeSpeed(newSpeed,getCurrentDirection());
            //System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }

    }
}
