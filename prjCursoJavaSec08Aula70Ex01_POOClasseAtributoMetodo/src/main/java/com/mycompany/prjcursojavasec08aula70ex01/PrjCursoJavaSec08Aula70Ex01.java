package com.mycompany.prjcursojavasec08aula70ex01;

import entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec08Aula70Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Rectangle rectangle = new Rectangle();
        System.out.println("Digite o valor dos lados do retângulo: ");
        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();
         
        System.out.printf("Área = %.2f%n"
                + "Perimeter = %.2f%n"
                + "Diagonal = %.2f%n", 
                rectangle.area(),
                rectangle.perimeter(),
                rectangle.diagonal());          
        sc.close();
    }
}
