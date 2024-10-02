package com.mycompany.prjcursojavasec04aula30ex01;

/**
 *
 * @author Marcinha
 */
import java.util.Scanner;
public class PrjCursoJavaSec04Aula30Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int soma = valor1 + valor2;
        
        System.out.println("Soma = "+ soma);
        
        sc.close();
    }
}
