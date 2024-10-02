package com.mycompany.prjcursojavasec04aula30ex02;

import java.util.Scanner;

public class PrjCursoJavaSec04Aula30Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        double Pi = 3.14159;
        double r = sc.nextDouble();
        double result = Pi*(r*r);
        
        System.out.print("Resultado :"+ result);
        
        sc.close();
    }
}
