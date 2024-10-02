package entities;

public class Company extends TaxPayer{
    
    private Integer numberOfEmployees;
    
    public Company(){
    }

    public Company(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company(Integer numberOfEmployees, String name, Double anualIncome) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    @Override
    public double tax(){
        double imposto = 16/100;
        if (numberOfEmployees > 10){
            imposto = 0.14;
        }
        return getAnualIncome() * imposto;
    }
}
