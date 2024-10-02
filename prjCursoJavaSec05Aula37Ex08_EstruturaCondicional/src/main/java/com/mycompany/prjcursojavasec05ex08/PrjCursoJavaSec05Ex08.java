package com.mycompany.prjcursojavasec05ex08;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec05Ex08 {

    public static void main(String[] args) {
        double imposto;
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Informe o salário: ");
        double salary = sc.nextDouble();
        
        if (salary <= 2000){
            imposto = 0;
        }
        else if (salary <= 3000){
            imposto = (salary - 2000) * 8 / 100;
        }
        else if (salary <= 4500) {
            imposto = ((salary - 3000) * 18 / 100) + (1000 * 8 / 100);
        }
        else {
            imposto = ((salary - 4500) * 28 / 100) + (1500 * 18 / 100) + (1000 * 8 / 100);
        }
        
        if (imposto == 0) {
            System.out.println("IMPOSTO = ISENTO");
        }
        else {
            System.out.printf("IMPOSTO = %.2f", imposto);
        }
        
    }
}
