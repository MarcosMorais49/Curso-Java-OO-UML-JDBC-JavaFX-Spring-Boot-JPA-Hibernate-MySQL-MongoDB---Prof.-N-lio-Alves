package com.mycompany.prjcursojavasec06aula54ex01;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec06Aula54Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();
        for (int i=0; i<=num; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
