package Application;

import controller.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec08Aula73Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the dollar price?");
        CurrencyConverter.price = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double total = sc.nextDouble();
        System.out.println("Amount to be paid in reais = "+CurrencyConverter.total(total));
        sc.close();
    }
}
