package org.smart;

public abstract class Length {

    protected double value;

    public Length(double value){
        this.value = value;
    }

    public abstract double getStandard();

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
        return isObjectValid(obj) && (this.getStandard()==((Length)obj).getStandard());
    }

    private boolean isObjectValid(Object obj) {
        if(obj==null){
            return false;
        }
        return isAllowedClass(this) && isAllowedClass(obj);
    }
}
