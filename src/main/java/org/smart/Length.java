package org.smart;

public abstract class Length {

    private double value;
    private double standard;

    public Length(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getStandard() {
        return standard;
    }

    public void setStandard(double standard) {
        this.standard = standard;
    }

    private boolean isAllowedClass(Object obj){
        if(obj.getClass()==Inch.class || obj.getClass()==Feet.class || obj.getClass()==Yard.class || obj.getClass()==Mile.class){
            return true;
        }
        return false;
    }

    public Length add(Length addend){
        double sum = this.getStandard()+addend.getStandard();
        Inch inch = new Inch(sum);
        return inch;
    }

    @Override
    public final boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        else if(isAllowedClass(this) && isAllowedClass(obj)){
            return this.getStandard()==((Length)obj).getStandard();
        }else{
            return false;
        }
    }
}
