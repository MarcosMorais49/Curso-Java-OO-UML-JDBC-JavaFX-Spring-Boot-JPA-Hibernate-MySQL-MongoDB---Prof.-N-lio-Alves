package application;

import entities.Account;
import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec09Aula82Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        char option = sc.next().charAt(0);
        
        Account acc = null;
        if (option == 'y'){
            System.out.println("Enter initial deposit value: ");
            double value = sc.nextDouble();
            acc = new Account(number, holder, value);
        }
        else if (option == 'n'){
            acc = new Account(number, holder);
        }
        else {
            System.out.println("Invalid Option!");
        }
        System.out.println("");
        System.out.println(acc);
        
        System.out.println("");
        System.out.println("Enter a deposit value: ");
        double value = sc.nextDouble();
        acc.deposito(value);
        System.out.println(acc);
        
        System.out.println("");
        System.out.println("Enter a withdraw value: ");
        value = sc.nextDouble();
        acc.saque(value);
        System.out.println(acc);
        
        
        sc.close();
    }
}
