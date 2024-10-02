package application;

import entities.Account;
import entitiesDomainException.DomainException;
import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec15Aula178Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double limit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, limit);

            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            
            System.out.println("");
            System.out.println("New balance: "+account);

            sc.close();
        }
        catch (DomainException e){
            System.out.println("Withdraw error: "+e.getMessage());
        }
    }
}
