package entities;

public class Individual extends TaxPayer {
    
    private Double healtExpenditures;
    
    public Individual(){
    }

    public Individual(Double healtExpenditures) {
        this.healtExpenditures = healtExpenditures;
    }

    public Individual(Double healtExpenditures, String name, Double anualIncome) {
        super(name, anualIncome);
        this.healtExpenditures = healtExpenditures;
    }

    public Double getHealtExpenditures() {
        return healtExpenditures;
    }

    public void setHealtExpenditures(Double healtExpenditures) {
        this.healtExpenditures = healtExpenditures;
    }
   
    @Override
    public double tax(){
        double imposto = 0;
        if (getAnualIncome() < 20000.00){
            imposto = 0.15;
        }
        else{
            imposto = 0.25;
        }
        return (getAnualIncome()*imposto)-(healtExpenditures / 2);
    }
}
