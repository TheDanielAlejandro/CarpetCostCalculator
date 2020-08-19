package com.company;

public class Calculator {                                                                                               // . Creating the class "Calculator".

    private Floor floor;                                                                                                // . The class has 2 instances, "floor" type Floor and "carpet" type Carpet.
    private Carpet carpet;                                                                                              // . the class Calculator creates an object calculator using the 2 other classes Carpet, Floor.


    // CONSTRUCTOR

    public Calculator(Floor floor, Carpet carpet){                                                                      // . The constructor has 2 parameters floor and carpet.
        this.floor = floor;                                                                                             // . Setting the values from the parameters obtained in input.
        this.carpet = carpet;
    }


    // METHODS

    public double getTotalCost(){                                                                                       // . The method "getTotalCost()" has no parameters.
        return floor.getArea() * carpet.getCost();                                                                      // . Returns the multiplication of the method "getArea" (from the class floor) and "getCost" (from the class carpet).
    }
}
