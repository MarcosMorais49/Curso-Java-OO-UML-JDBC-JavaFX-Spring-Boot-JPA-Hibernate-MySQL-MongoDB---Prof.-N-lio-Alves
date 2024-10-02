package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    
    public void saque(double valor){
        balance -= (valor+5);
    }
    
    public void deposito(double valor){
        balance += valor;
    }

    @Override
    public String toString() {
        return String.format( "Account Data: %n"
                + "Account %d, Holder : %s, Balance : $%.2f",number, holder, balance);
    }
           
    public Account(int number, String holder, double value){
        this.number = number;
        this.holder = holder;
        deposito(value);
    }
    
    public Account(int number, String holder){
        this.holder = holder;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
    
    public void setHolder(String holder){
        this.holder = holder;
    }
    
    public String getHolder(){
        return holder;
    }
}
