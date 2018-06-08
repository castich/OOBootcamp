package org.smart;

public class Meter extends Length {
    public Meter(double value){
        super(value);
    }

    @Override
    public double getStandard() {
        return value*0;
    }
}