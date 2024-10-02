package com.mycompany.prjcursojavasec05aula37ex07;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec05Aula37Ex07 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite dois valores com máximo de uma casa decimal");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        
        if (num1 > 0 && num2 > 0){
            System.out.println("Q1");
        }
        else if (num1 > 0 && num2 < 0) {
            System.out.println("Q4");
        }
        else if (num1 < 0 && num2 > 0) {
            System.out.println("Q2");
        }
        else if (num1 < 0 && num2 < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Origem");
        }
        
        
    }
}
