package com.company;

public class Floor {                                                                                                    // . Creating the class "Floor" to calculate the area of the floor, length and width are instances.

    private double width;
    private double length;


    // CONSTRUCTOR                                                                                                      // . The constructor has 2 parameters width and length.

    public Floor(double width, double length){
        if(width < 0){                                                                                                  // . Checking if the parameters are lower than 0 if yes set the value to 0.
            width = 0;
        }

        if(length < 0){
            length = 0;
        }

        this.width = width;
        this.length = length;
    }


    // METHODS

    public double getArea(){                                                                                            // . Method that returns the area of the room (supposing is a rectangular/squared room).
        return width * length;                                                                                          // . The formula is width * length.
    }


}
