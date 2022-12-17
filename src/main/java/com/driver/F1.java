package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,isManual);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = speed(rate); //set the value of new speed by using currentSpeed and rate


        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            changeGear(1);
            System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);
            stop();
        }
        //for all other cases, change the gear accordingly

        else if(newSpeed >=1 &&50>=newSpeed) {
            changeGear(1);
            System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        else if(newSpeed >=51 &&100>=newSpeed) {
            changeGear(2);
            System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        else if(newSpeed >=101 &&150>=newSpeed) {
            changeGear(3);
            System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        else if(newSpeed >=151 &&200>=newSpeed) {
            changeGear(4);
            System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        else if(newSpeed >=201 &&250>=newSpeed) {
            changeGear(5);
            System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }
        else if(250<newSpeed) {
            changeGear(6);
            System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed);

        }

    }
}
