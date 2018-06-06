package org.smart;

public class Yard extends Length {
    private static final double YARD = 36;

    public Yard(double value) {
        super(value);
        setStandard(value*YARD);
    }
}
