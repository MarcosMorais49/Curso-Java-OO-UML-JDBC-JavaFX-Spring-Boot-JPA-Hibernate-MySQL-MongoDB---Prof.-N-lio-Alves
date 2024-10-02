package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public UsedProduct(){
        super();
    }

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag(){
        return getName() + String.format(" (used) $ %.2f", getPrice()) + " (Manufacture date: "+ sdf.format(manufactureDate) +")";
    }
}
