package com.mycompany.prjcursojavasec04aula30ex03;

import java.util.Scanner;

public class PrjCursoJavaSec04Aula30Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d, total;
        System.out.print("Informe o 1º número inteiro: ");
        a = sc.nextInt();
        System.out.print("Informe o 2º número inteiro: ");
        b = sc.nextInt();
        System.out.print("Informe o 3º número inteiro: ");
        c = sc.nextInt();
        System.out.print("Informe o 4º número inteiro: ");
        d = sc.nextInt();
        total = a*b - c*d;
        
        System.out.print("A diferença é: "+total);
        sc.close();
    }
}
