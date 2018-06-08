package org.smart;

public class Mile extends Length {
    private static final double MILE = 63360;

    public Mile(double value){
        super(value);
//        setStandard(value*MILE);
    }

    @Override
    public double getStandard() {
        return value*MILE;
    }
}
