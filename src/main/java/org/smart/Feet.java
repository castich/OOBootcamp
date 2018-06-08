package org.smart;

public class Feet extends Length {
    public static final double FEET = 12;

    public Feet(double value){
        super(value);
//        setStandard(value*FEET);
    }

    @Override
    public double getStandard() {
        return value*FEET;
    }
}
