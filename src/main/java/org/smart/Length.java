package org.smart;

public abstract class Length {

    private double value;
    private final double INCH = 1;
    private final double FEET = 12;
    private final double YARD = 36;
    private final double MILE = 63360;

    public Length(double value){
        if(this.getClass()==Inch.class){
            this.value=value*INCH;
        }
        else if(this.getClass()==Feet.class){
            this.value=value*FEET;
        }
        else if(this.getClass()==Yard.class){
            this.value=value*YARD;
        }
        else if(this.getClass()==Mile.class){
            this.value=value*MILE;
        }
        else{
            this.value = 0;
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        return this.getValue()==((Length)obj).getValue();
    }
}
