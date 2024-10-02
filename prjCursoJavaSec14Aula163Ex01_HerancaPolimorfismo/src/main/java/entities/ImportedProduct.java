package entities;

public class ImportedProduct extends Product{
    private Double customsFee;
    
    public ImportedProduct(){
        super();
    }
    
    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    @Override
    public String priceTag(){
        return getName() + String.format(" $ %.2f (Customs fee: $ %.2f) ",totalPrice(),customsFee);
    }
    
    public Double totalPrice(){
        return getPrice() + getCustomsFee();
    }

    
    
    
}
