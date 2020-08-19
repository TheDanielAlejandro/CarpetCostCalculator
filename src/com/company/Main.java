package com.company;

public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3.5);                                                                           // . Creating a new object type Carpet.
        Floor floor = new Floor(2.75, 4.0);                                                                 // . Creating a new object type Floor.
        Calculator calculator = new Calculator(floor, carpet);                                                          // . Creating a new object type Calculator passing the floor and carpet objects.

        System.out.println("total = " + calculator.getTotalCost());                                                     // . Printing the return of the method getTotalCost() from the class Calculator.

        carpet = new Carpet(1.5);                                                                                  // . Creating a new object type Carpet.
        floor = new Floor(5.4, 4.5);                                                                        // . Creating a new object type Floor.
        calculator = new Calculator(floor, carpet);                                                                     // . Creating a new object type Calculator passing the floor and carpet objects.

        System.out.println("total= " + calculator.getTotalCost());                                                      // . Printing the return of the method getTotalCost() from the class Calculator


    }
}
