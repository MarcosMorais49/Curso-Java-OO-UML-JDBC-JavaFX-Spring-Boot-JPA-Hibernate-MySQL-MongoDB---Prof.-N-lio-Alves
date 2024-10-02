package services;

import entities.CarRental;
import entities.Invoice;
import java.time.Duration;

public class RentalServices {
    private Double pricePerDay;
    private Double pricePerHour;
    
    private BrazilTaxServices taxService;

    public RentalServices(Double pricePerDay, Double pricePerHour, BrazilTaxServices taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }
    
    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        
        double basicPayment;
        
        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }
        
        double tax = taxService.tax(basicPayment);
        
        
        carRental.setInovice(new Invoice(basicPayment, tax));
    }
    
}
