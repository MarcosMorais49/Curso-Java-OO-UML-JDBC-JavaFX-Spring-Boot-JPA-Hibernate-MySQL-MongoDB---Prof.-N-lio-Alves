package controller;

public class CurrencyConverter {
    public static double price;
    public static final double IOF = 6;
    
    public static double total(double valor){
        return (valor*price)+(valor*price*IOF/100);
    }
}
