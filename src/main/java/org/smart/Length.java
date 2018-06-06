package org.smart;

public abstract class Length {

    private double value;
    private double standard;

    public Length(double value){
        if(this.getClass()==Inch.class || this.getClass()==Feet.class || this.getClass()==Yard.class || this.getClass()==Mile.class){
            this.value = value;
        }else{
            this.value = 0;
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    protected double getStandard() {
        return standard;
    }

    protected void setStandard(double standard) {
        this.standard = standard;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        return this.getStandard()==((Length)obj).getStandard();
    }
}
