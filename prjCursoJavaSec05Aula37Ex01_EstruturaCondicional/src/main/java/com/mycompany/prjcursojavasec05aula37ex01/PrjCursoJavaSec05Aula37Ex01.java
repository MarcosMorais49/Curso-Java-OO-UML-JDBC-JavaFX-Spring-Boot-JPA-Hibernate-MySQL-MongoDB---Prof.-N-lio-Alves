package com.mycompany.prjcursojavasec05aula37ex01;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec05Aula37Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("Número Positivo");
        }
        else {
            System.out.println("Número Negativo");
        }
    }        
}
