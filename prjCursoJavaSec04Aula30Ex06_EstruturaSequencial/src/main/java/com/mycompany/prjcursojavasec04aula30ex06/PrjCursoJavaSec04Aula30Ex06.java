package com.mycompany.prjcursojavasec04aula30ex06;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec04Aula30Ex06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, triangulo, circulo, trapezio,
                quadrado, retangulo, pi = 3.14159;
        
        System.out.println("Informe três valores com ponto flutuante: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        triangulo = a * c / 2;
        circulo = pi* (c*c);
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;
        
        System.out.printf("TRIÂNGULO = %.2f %n"
                + "CÍRCULO = %.2f %n"
                + "TRAPÉZIO = %.2f %n"
                + "QUADRADO = %.2f %n"
                + "RETÂNGULO = %.2f %n", triangulo, circulo,
                trapezio, quadrado, retangulo);
        
        sc.close();
    }
}
