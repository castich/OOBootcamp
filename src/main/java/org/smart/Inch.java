package org.smart;

public class Inch extends Length {
    private static final double INCH = 1;

    public Inch(double value){
        super(value);
        setStandard(value*INCH);
    }
}
