package com.company;

public class Carpet {                                                                                                   // . Creating the class "Carpet" that sets the cost of the carpet per square mt.

    private double cost;                                                                                                // . The class has only one instance that is the cost.


    // CONSTRUCTOR

    public Carpet(double cost){                                                                                         // . The constructor has only one parameter.
        if(cost < 0){                                                                                                   // . Checking if the parameter inserted is lower than 0, if it is, set the value to 0.
            cost = 0;
        }
        this.cost = cost;
    }


    // GET METHOD

    public double getCost(){                                                                                            // . Method that returns the cost settled.
        return cost;
    }

}
