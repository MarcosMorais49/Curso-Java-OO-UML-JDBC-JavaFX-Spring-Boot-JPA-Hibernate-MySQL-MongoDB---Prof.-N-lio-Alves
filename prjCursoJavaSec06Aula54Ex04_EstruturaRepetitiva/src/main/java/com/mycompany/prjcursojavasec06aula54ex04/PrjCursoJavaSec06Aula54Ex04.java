package com.mycompany.prjcursojavasec06aula54ex04;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec06Aula54Ex04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int n = sc.nextInt();
        
        for (int i=0; i<n; i++){
            System.out.println("Informe dois números inteiros para efetuar a divisão: ");
            int valor1 = sc.nextInt();
            int valor2 = sc.nextInt();
            if (valor2 == 0){
                System.out.println("Divisão impossível");
            }
            else {
                System.out.println(valor1/valor2);
            }
        }
    }
}
