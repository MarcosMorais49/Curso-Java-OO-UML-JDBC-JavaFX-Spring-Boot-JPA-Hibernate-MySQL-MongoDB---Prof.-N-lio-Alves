package entities;

public class OutsourceEmployee extends Employee{
    
    private double additionalCharge;
    
    public OutsourceEmployee(){
        super();
    }

    public OutsourceEmployee(double additionalCharge, String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
