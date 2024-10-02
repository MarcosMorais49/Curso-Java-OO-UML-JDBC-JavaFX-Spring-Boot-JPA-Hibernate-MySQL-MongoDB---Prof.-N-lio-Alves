package com.mycompany.prjcursojavasec06aula54ex07;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec06Aula54Ex07 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();
        
        for (int i=1; i<=num; i++){
            System.out.println(i+" "+i*i+" "+i*i*i);
        }
    }
}
