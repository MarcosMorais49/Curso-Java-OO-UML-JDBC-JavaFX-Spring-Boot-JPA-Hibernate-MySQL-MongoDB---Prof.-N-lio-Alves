package com.mycompany.prjcursojavasec04aula30ex05;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec04Aula30Ex05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int cod1, num1, cod2, num2;
        double valor1, valor2, total;
        
        System.out.println("Informe o código da peça 1: ");
        cod1 = sc.nextInt();
        System.out.println("Informe a quantidade d peças 1: ");
        num1 = sc.nextInt();
        System.out.println("Informe o valor da peça 1: ");
        valor1 = sc.nextDouble();
        
        System.out.println("Informe o código da peça 2: ");
        cod2 = sc.nextInt();
        System.out.println("Informe a quantidade d peças 2: ");
        num2 = sc.nextInt();
        System.out.println("Informe o valor da peça 2: ");
        valor2 = sc.nextDouble();
        
        total = num1*valor1 + num2*valor2;
        
        System.out.printf("Valor a pagar: R$%.2f",total);
    }
}
